package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lf0 implements Runnable {
    public final int f41259a;
    public final of0 f41260b;

    public lf0(of0 of0Var, int i10) {
        this.f41259a = i10;
        this.f41260b = of0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41259a) {
            case 0:
                gg0 gg0Var = this.f41260b.v;
                gg0Var.z1(0, true, null, true);
                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                gg0 gg0Var2 = this.f41260b.v;
                gg0Var2.z1(0, true, null, true);
                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f41260b.o();
                return;
            case 3:
                this.f41260b.f42174b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                gg0 gg0Var3 = this.f41260b.v;
                i10 = ((org.telegram.ui.ActionBar.r2) gg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                gg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
