package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nf0 implements Runnable {
    public final int f39816a;
    public final qf0 f39817b;

    public nf0(qf0 qf0Var, int i10) {
        this.f39816a = i10;
        this.f39817b = qf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39816a) {
            case 0:
                hg0 hg0Var = this.f39817b.v;
                hg0Var.y1(0, true, null, true);
                hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                hg0 hg0Var2 = this.f39817b.v;
                hg0Var2.y1(0, true, null, true);
                hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f39817b.o();
                return;
            case 3:
                this.f39817b.f40808b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                hg0 hg0Var3 = this.f39817b.v;
                i10 = ((org.telegram.ui.ActionBar.o2) hg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                hg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
