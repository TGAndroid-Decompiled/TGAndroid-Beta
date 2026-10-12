package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a7 implements Runnable {
    public final int f34472a;
    public final c7 f34473b;

    public a7(c7 c7Var, int i10) {
        this.f34472a = i10;
        this.f34473b = c7Var;
    }

    @Override
    public final void run() {
        switch (this.f34472a) {
            case 0:
                c7 c7Var = this.f34473b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity(), 0, c7Var.getResourceProvider());
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f34473b.Y();
                return;
        }
    }
}
