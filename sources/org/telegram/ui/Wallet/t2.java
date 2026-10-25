package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wc;
public final class t2 implements Runnable {
    public final int f37259a;
    public final org.telegram.ui.ActionBar.r2 f37260b;

    public t2(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f37259a = i10;
        this.f37260b = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f37259a) {
            case 0:
                org.telegram.ui.ActionBar.r2 r2Var = this.f37260b;
                m5.E0(r2Var.getContext(), r2Var.getResourceProvider());
                return;
            case 1:
                this.f37260b.presentFragment(new m5());
                return;
            default:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.f37260b;
                if (wc.a(r2Var2)) {
                    wc.b0(r2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
