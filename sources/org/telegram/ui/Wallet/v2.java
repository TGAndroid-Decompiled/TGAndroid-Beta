package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class v2 implements Runnable {
    public final int f34952a;
    public final org.telegram.ui.ActionBar.n2 f34953b;

    public v2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34952a = i10;
        this.f34953b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f34952a) {
            case 0:
                this.f34953b.presentFragment(new l5());
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f34953b;
                if (xc.a(n2Var)) {
                    xc.a0(n2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
