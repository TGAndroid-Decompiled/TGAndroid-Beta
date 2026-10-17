package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y7 implements Runnable {
    public final int f35181a;
    public final z7 f35182b;

    public y7(z7 z7Var, int i10) {
        this.f35181a = i10;
        this.f35182b = z7Var;
    }

    @Override
    public final void run() {
        switch (this.f35181a) {
            case 0:
                z7 z7Var = this.f35182b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z7Var.getParentActivity(), 0, z7Var.getResourceProvider());
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f35182b.Y();
                return;
        }
    }
}
