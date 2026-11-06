package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class v0 extends BiometricPrompt$AuthenticationCallback {
    public final w0 f43227a;

    public v0(w0 w0Var) {
        this.f43227a = w0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.f43227a.f()) {
            w0 w0Var = this.f43227a;
            if (!w0Var.f43251f) {
                if (i7 != 10 && i7 != 5) {
                    w0Var.a();
                } else {
                    w0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f43227a.c(null);
    }
}
