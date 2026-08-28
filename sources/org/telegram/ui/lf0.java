package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lf0 implements Runnable {
    public final int f40127a;
    public final of0 f40128b;

    public lf0(of0 of0Var, int i9) {
        this.f40127a = i9;
        this.f40128b = of0Var;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f40127a) {
            case 0:
                fg0 fg0Var = this.f40128b.v;
                fg0Var.u1(0, true, null, true);
                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                fg0 fg0Var2 = this.f40128b.v;
                fg0Var2.u1(0, true, null, true);
                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f40128b.p();
                return;
            case 3:
                this.f40128b.f41140b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                fg0 fg0Var3 = this.f40128b.v;
                i9 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i9);
                fg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
