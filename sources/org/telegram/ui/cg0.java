package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cg0 implements Runnable {
    public final int f32657a;
    public final gg0 f32658b;

    public cg0(gg0 gg0Var, int i10) {
        this.f32657a = i10;
        this.f32658b = gg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f32657a) {
            case 0:
                xg0 xg0Var = this.f32658b.v;
                xg0Var.u1(0, true, null, true);
                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                xg0 xg0Var2 = this.f32658b.v;
                xg0Var2.u1(0, true, null, true);
                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f32658b.p();
                return;
            case 3:
                this.f32658b.f33837b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                xg0 xg0Var3 = this.f32658b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) xg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                xg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
