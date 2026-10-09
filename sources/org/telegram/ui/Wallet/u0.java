package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u0 extends FingerprintManager.AuthenticationCallback {
    public final v0 f35528a;

    public u0(v0 v0Var) {
        this.f35528a = v0Var;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        v0 v0Var = this.f35528a;
        if (v0Var.f() && !v0Var.f35556f) {
            if (i10 == 5) {
                v0Var.c("AUTH_CANCELED");
            } else {
                v0Var.a();
            }
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        v0 v0Var = this.f35528a;
        if (v0Var.f() && (alertDialog = v0Var.f35558i) != null) {
            alertDialog.setMessage(LocaleController.getString(R.string.WalletFingerprintRetry));
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        v0 v0Var = this.f35528a;
        if (v0Var.f() && (alertDialog = v0Var.f35558i) != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        v0 v0Var = this.f35528a;
        if (!v0Var.f35556f) {
            v0Var.c(null);
        }
    }
}
