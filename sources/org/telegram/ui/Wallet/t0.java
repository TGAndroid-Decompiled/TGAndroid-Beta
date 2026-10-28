package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final v0 f37280a;

    public t0(v0 v0Var) {
        this.f37280a = v0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f37280a.f()) {
            v0 v0Var = this.f37280a;
            if (!v0Var.f37391f) {
                if (i10 != 10 && i10 != 5) {
                    v0Var.a();
                } else {
                    v0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f37280a.c(null);
    }
}
