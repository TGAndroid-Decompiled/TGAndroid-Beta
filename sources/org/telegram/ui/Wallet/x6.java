package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x6 implements Runnable {
    public final int f33855a;
    public final z6 f33856b;

    public x6(z6 z6Var, int i10) {
        this.f33855a = i10;
        this.f33856b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f33855a) {
            case 0:
                z6 z6Var = this.f33856b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f33856b.Y();
                return;
        }
    }
}
