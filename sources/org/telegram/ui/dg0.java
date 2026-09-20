package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dg0 implements Runnable {
    public final int f33036a;
    public final hg0 f33037b;

    public dg0(hg0 hg0Var, int i10) {
        this.f33036a = i10;
        this.f33037b = hg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f33036a) {
            case 0:
                yg0 yg0Var = this.f33037b.v;
                yg0Var.u1(0, true, null, true);
                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                yg0 yg0Var2 = this.f33037b.v;
                yg0Var2.u1(0, true, null, true);
                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f33037b.p();
                return;
            case 3:
                this.f33037b.f34196b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                yg0 yg0Var3 = this.f33037b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) yg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                yg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
