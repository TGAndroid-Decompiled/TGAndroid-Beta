package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class of0 implements Runnable {

    public final int f41081a;

    public final rf0 f41082b;

    public of0(rf0 rf0Var, int i10) {
        this.f41081a = i10;
        this.f41082b = rf0Var;
    }

    @Override
    public final void run() {
        switch (this.f41081a) {
            case 0:
                ig0 ig0Var = this.f41082b.v;
                ig0Var.u1(0, true, null, true);
                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                ig0 ig0Var2 = this.f41082b.v;
                ig0Var2.u1(0, true, null, true);
                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.f41082b.p();
                break;
            case 3:
                this.f41082b.f41919b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ig0 ig0Var3 = this.f41082b.v;
                premiumPreviewFragment.setCurrentAccount(((org.telegram.ui.ActionBar.n2) ig0Var3).currentAccount);
                ig0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
