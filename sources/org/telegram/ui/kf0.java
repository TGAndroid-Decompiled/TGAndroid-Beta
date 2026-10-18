package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kf0 implements Runnable {
    public final int f38504a;
    public final nf0 f38505b;

    public kf0(nf0 nf0Var, int i10) {
        this.f38504a = i10;
        this.f38505b = nf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38504a) {
            case 0:
                eg0 eg0Var = this.f38505b.v;
                eg0Var.u1(0, true, null, true);
                eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                eg0 eg0Var2 = this.f38505b.v;
                eg0Var2.u1(0, true, null, true);
                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f38505b.p();
                return;
            case 3:
                this.f38505b.f39425b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                eg0 eg0Var3 = this.f38505b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) eg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                eg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
