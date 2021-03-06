package co.com.cfn.foundation.framework.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * cfn Generic Artifact
 * <p/>
 * Created: 4-Ene-2017
 * Type: JAVA class
 * Artifact Purpose: Exception - Model Artifact
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

@XmlRootElement(namespace = "http://cibercolegios.com/domain-artifacts/common/1.0.0")
public class SystemException extends Exception {

    private static final long serialVersionUID = 1L;
    private String reason;

    public SystemException() {
        super();
    }

    public SystemException(String s) {
        super(s);
        this.reason = s;
    }

    public SystemException(String s, Throwable throwable) {
        super(s, throwable);
        this.reason = s;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
