package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class of0 implements Runnable {
    public final int f40150a;
    public final rf0 f40151b;

    public of0(rf0 rf0Var, int i10) {
        this.f40150a = i10;
        this.f40151b = rf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40150a) {
            case 0:
                ig0 ig0Var = this.f40151b.v;
                ig0Var.y1(0, true, null, true);
                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                ig0 ig0Var2 = this.f40151b.v;
                ig0Var2.y1(0, true, null, true);
                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f40151b.o();
                return;
            case 3:
                this.f40151b.f41121b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ig0 ig0Var3 = this.f40151b.v;
                i10 = ((org.telegram.ui.ActionBar.o2) ig0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ig0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
