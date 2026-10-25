package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final v0 f37253a;

    public t0(v0 v0Var) {
        this.f37253a = v0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f37253a.f()) {
            v0 v0Var = this.f37253a;
            if (!v0Var.f37364f) {
                if (i10 != 10 && i10 != 5) {
                    v0Var.a();
                } else {
                    v0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f37253a.c(null);
    }
}
