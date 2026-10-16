package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y6 implements Runnable {
    public final int f33627a;
    public final a7 f33628b;

    public y6(a7 a7Var, int i10) {
        this.f33627a = i10;
        this.f33628b = a7Var;
    }

    @Override
    public final void run() {
        switch (this.f33627a) {
            case 0:
                a7 a7Var = this.f33628b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity(), 0, a7Var.getResourceProvider());
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f33628b.Y();
                return;
        }
    }
}
