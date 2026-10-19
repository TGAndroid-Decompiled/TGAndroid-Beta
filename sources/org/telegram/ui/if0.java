package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class if0 implements Runnable {
    public final int f37982a;
    public final lf0 f37983b;

    public if0(lf0 lf0Var, int i10) {
        this.f37982a = i10;
        this.f37983b = lf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37982a) {
            case 0:
                cg0 cg0Var = this.f37983b.v;
                cg0Var.u1(0, true, null, true);
                cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                cg0 cg0Var2 = this.f37983b.v;
                cg0Var2.u1(0, true, null, true);
                cg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f37983b.p();
                return;
            case 3:
                this.f37983b.f38907b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                cg0 cg0Var3 = this.f37983b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) cg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                cg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
