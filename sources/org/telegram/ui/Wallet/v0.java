package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class v0 extends BiometricPrompt$AuthenticationCallback {
    public final w0 f43226a;

    public v0(w0 w0Var) {
        this.f43226a = w0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.f43226a.f()) {
            w0 w0Var = this.f43226a;
            if (!w0Var.f43250f) {
                if (i7 != 10 && i7 != 5) {
                    w0Var.a();
                } else {
                    w0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f43226a.c(null);
    }
}
