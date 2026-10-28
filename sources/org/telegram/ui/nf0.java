package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nf0 implements Runnable {
    public final int f41789a;
    public final qf0 f41790b;

    public nf0(qf0 qf0Var, int i10) {
        this.f41789a = i10;
        this.f41790b = qf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41789a) {
            case 0:
                ig0 ig0Var = this.f41790b.v;
                ig0Var.z1(0, true, null, true);
                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                ig0 ig0Var2 = this.f41790b.v;
                ig0Var2.z1(0, true, null, true);
                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f41790b.o();
                return;
            case 3:
                this.f41790b.f42697b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ig0 ig0Var3 = this.f41790b.v;
                i10 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ig0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
