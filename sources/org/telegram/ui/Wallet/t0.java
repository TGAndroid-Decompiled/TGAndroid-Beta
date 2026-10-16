package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final v0 f33448a;

    public t0(v0 v0Var) {
        this.f33448a = v0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f33448a.f()) {
            v0 v0Var = this.f33448a;
            if (!v0Var.f33493f) {
                if (i10 != 10 && i10 != 5) {
                    v0Var.a();
                } else {
                    v0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f33448a.c(null);
    }
}
