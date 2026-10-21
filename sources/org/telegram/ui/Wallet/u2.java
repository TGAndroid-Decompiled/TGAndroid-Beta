package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class u2 implements Runnable {
    public final int f34987a;
    public final org.telegram.ui.ActionBar.n2 f34988b;

    public u2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34987a = i10;
        this.f34988b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f34987a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = this.f34988b;
                o5.D0(n2Var.getContext(), n2Var.getResourceProvider());
                return;
            case 1:
                this.f34988b.presentFragment(new o5());
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f34988b;
                if (xc.a(n2Var2)) {
                    xc.a0(n2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
