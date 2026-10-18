package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b8 implements Runnable {
    public final int f34061a;
    public final c8 f34062b;

    public b8(c8 c8Var, int i10) {
        this.f34061a = i10;
        this.f34062b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f34061a) {
            case 0:
                c8 c8Var = this.f34062b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c8Var.getParentActivity(), 0, c8Var.getResourceProvider());
                alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                return;
            default:
                this.f34062b.Y();
                return;
        }
    }
}
