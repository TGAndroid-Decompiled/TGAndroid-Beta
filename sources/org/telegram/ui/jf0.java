package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jf0 implements Runnable {
    public final int f38252a;
    public final mf0 f38253b;

    public jf0(mf0 mf0Var, int i10) {
        this.f38252a = i10;
        this.f38253b = mf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38252a) {
            case 0:
                dg0 dg0Var = this.f38253b.v;
                dg0Var.u1(0, true, null, true);
                dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                dg0 dg0Var2 = this.f38253b.v;
                dg0Var2.u1(0, true, null, true);
                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f38253b.p();
                return;
            case 3:
                this.f38253b.f39236b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                dg0 dg0Var3 = this.f38253b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) dg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                dg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
