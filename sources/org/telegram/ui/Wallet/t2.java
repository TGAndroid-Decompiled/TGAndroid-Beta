package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.vc;
public final class t2 implements Runnable {
    public final int f35205a;
    public final org.telegram.ui.ActionBar.o2 f35206b;

    public t2(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f35205a = i10;
        this.f35206b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f35205a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = this.f35206b;
                o5.D0(o2Var.getContext(), o2Var.getResourceProvider());
                return;
            case 1:
                this.f35206b.presentFragment(new o5());
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f35206b;
                if (vc.a(o2Var2)) {
                    vc.a0(o2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
