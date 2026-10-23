package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class t2 implements Runnable {
    public final int f35203a;
    public final org.telegram.ui.ActionBar.o2 f35204b;

    public t2(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f35203a = i10;
        this.f35204b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f35203a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = this.f35204b;
                o5.D0(o2Var.getContext(), o2Var.getResourceProvider());
                return;
            case 1:
                this.f35204b.presentFragment(new o5());
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f35204b;
                if (xc.a(o2Var2)) {
                    xc.a0(o2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
