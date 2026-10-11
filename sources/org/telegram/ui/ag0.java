package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ag0 implements Runnable {
    public final int f36102a;
    public final eg0 f36103b;

    public ag0(eg0 eg0Var, int i10) {
        this.f36102a = i10;
        this.f36103b = eg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36102a) {
            case 0:
                vg0 vg0Var = this.f36103b.v;
                vg0Var.u1(0, true, null, true);
                vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                vg0 vg0Var2 = this.f36103b.v;
                vg0Var2.u1(0, true, null, true);
                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f36103b.p();
                return;
            case 3:
                this.f36103b.f37337b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                vg0 vg0Var3 = this.f36103b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) vg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                vg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
