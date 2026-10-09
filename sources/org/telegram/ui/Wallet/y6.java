package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y6 implements Runnable {
    public final int f35698a;
    public final a7 f35699b;

    public y6(a7 a7Var, int i10) {
        this.f35698a = i10;
        this.f35699b = a7Var;
    }

    @Override
    public final void run() {
        switch (this.f35698a) {
            case 0:
                a7 a7Var = this.f35699b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity(), 0, a7Var.getResourceProvider());
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f35699b.Y();
                return;
        }
    }
}
