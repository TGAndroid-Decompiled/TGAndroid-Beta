package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final u0 f44504a;

    public t0(u0 u0Var) {
        this.f44504a = u0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.f44504a.f()) {
            u0 u0Var = this.f44504a;
            if (!u0Var.f44541f) {
                if (i7 != 10 && i7 != 5) {
                    u0Var.a();
                } else {
                    u0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f44504a.c(null);
    }
}
