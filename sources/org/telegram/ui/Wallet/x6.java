package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x6 implements Runnable {
    public final int f35632a;
    public final z6 f35633b;

    public x6(z6 z6Var, int i10) {
        this.f35632a = i10;
        this.f35633b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f35632a) {
            case 0:
                z6 z6Var = this.f35633b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f35633b.Y();
                return;
        }
    }
}
