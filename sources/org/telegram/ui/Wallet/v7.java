package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v7 implements Runnable {
    public final int f35329a;
    public final w7 f35330b;

    public v7(w7 w7Var, int i10) {
        this.f35329a = i10;
        this.f35330b = w7Var;
    }

    @Override
    public final void run() {
        switch (this.f35329a) {
            case 0:
                w7 w7Var = this.f35330b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f35330b.Y();
                return;
        }
    }
}
