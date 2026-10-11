package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a7 implements Runnable {
    public final int f34663a;
    public final c7 f34664b;

    public a7(c7 c7Var, int i10) {
        this.f34663a = i10;
        this.f34664b = c7Var;
    }

    @Override
    public final void run() {
        switch (this.f34663a) {
            case 0:
                c7 c7Var = this.f34664b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity(), 0, c7Var.getResourceProvider());
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f34664b.Y();
                return;
        }
    }
}
