package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class u0 extends BiometricPrompt$AuthenticationCallback {
    public final w0 f34974a;

    public u0(w0 w0Var) {
        this.f34974a = w0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f34974a.f()) {
            w0 w0Var = this.f34974a;
            if (!w0Var.f35047f) {
                if (i10 != 10 && i10 != 5) {
                    w0Var.a();
                } else {
                    w0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f34974a.c(null);
    }
}
