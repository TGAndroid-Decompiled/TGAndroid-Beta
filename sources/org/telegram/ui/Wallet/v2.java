package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class v2 implements Runnable {
    public final int f34990a;
    public final org.telegram.ui.ActionBar.n2 f34991b;

    public v2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34990a = i10;
        this.f34991b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f34990a) {
            case 0:
                this.f34991b.presentFragment(new m5());
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = this.f34991b;
                m5.B0(n2Var.getContext(), n2Var.getResourceProvider());
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f34991b;
                if (xc.a(n2Var2)) {
                    xc.a0(n2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
