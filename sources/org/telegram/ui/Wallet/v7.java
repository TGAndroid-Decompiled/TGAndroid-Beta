package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v7 implements Runnable {
    public final int f35025a;
    public final w7 f35026b;

    public v7(w7 w7Var, int i10) {
        this.f35025a = i10;
        this.f35026b = w7Var;
    }

    @Override
    public final void run() {
        switch (this.f35025a) {
            case 0:
                w7 w7Var = this.f35026b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
                alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f35026b.Y();
                return;
        }
    }
}
