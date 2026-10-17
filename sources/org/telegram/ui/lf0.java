package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lf0 implements Runnable {
    public final int f38867a;
    public final of0 f38868b;

    public lf0(of0 of0Var, int i10) {
        this.f38867a = i10;
        this.f38868b = of0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38867a) {
            case 0:
                fg0 fg0Var = this.f38868b.v;
                fg0Var.u1(0, true, null, true);
                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                fg0 fg0Var2 = this.f38868b.v;
                fg0Var2.u1(0, true, null, true);
                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f38868b.p();
                return;
            case 3:
                this.f38868b.f39764b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                fg0 fg0Var3 = this.f38868b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) fg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                fg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
