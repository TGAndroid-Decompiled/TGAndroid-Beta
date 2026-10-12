package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t0 extends FingerprintManager.AuthenticationCallback {
    public final u0 f33693a;

    public t0(u0 u0Var) {
        this.f33693a = u0Var;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        u0 u0Var = this.f33693a;
        if (u0Var.f() && !u0Var.f33721f) {
            if (i10 == 5) {
                u0Var.c("AUTH_CANCELED");
            } else {
                u0Var.a();
            }
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        u0 u0Var = this.f33693a;
        if (u0Var.f() && (alertDialog = u0Var.f33723i) != null) {
            alertDialog.setMessage(LocaleController.getString(R.string.WalletFingerprintRetry));
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        u0 u0Var = this.f33693a;
        if (u0Var.f() && (alertDialog = u0Var.f33723i) != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        u0 u0Var = this.f33693a;
        if (!u0Var.f33721f) {
            u0Var.c(null);
        }
    }
}
