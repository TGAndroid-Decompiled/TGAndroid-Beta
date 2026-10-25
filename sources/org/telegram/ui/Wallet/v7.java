package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v7 implements Runnable {
    public final int f37380a;
    public final w7 f37381b;

    public v7(w7 w7Var, int i10) {
        this.f37380a = i10;
        this.f37381b = w7Var;
    }

    @Override
    public final void run() {
        switch (this.f37380a) {
            case 0:
                w7 w7Var = this.f37381b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f37381b.Z();
                return;
        }
    }
}
