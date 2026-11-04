package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class s0 extends BiometricPrompt$AuthenticationCallback {
    public final t0 f43140a;

    public s0(t0 t0Var) {
        this.f43140a = t0Var;
    }

    public final void onAuthenticationError(int i3, CharSequence charSequence) {
        if (this.f43140a.f()) {
            t0 t0Var = this.f43140a;
            if (!t0Var.f43188f) {
                if (i3 != 10 && i3 != 5) {
                    t0Var.a();
                } else {
                    t0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f43140a.c(null);
    }
}
