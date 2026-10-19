package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class u2 implements Runnable {
    public final int f34980a;
    public final org.telegram.ui.ActionBar.n2 f34981b;

    public u2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34980a = i10;
        this.f34981b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f34980a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = this.f34981b;
                o5.D0(n2Var.getContext(), n2Var.getResourceProvider());
                return;
            case 1:
                this.f34981b.presentFragment(new o5());
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f34981b;
                if (xc.a(n2Var2)) {
                    xc.a0(n2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
