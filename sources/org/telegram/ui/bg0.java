package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bg0 implements Runnable {
    public final int f32157a;
    public final fg0 f32158b;

    public bg0(fg0 fg0Var, int i10) {
        this.f32157a = i10;
        this.f32158b = fg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f32157a) {
            case 0:
                wg0 wg0Var = this.f32158b.v;
                wg0Var.u1(0, true, null, true);
                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                wg0 wg0Var2 = this.f32158b.v;
                wg0Var2.u1(0, true, null, true);
                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f32158b.p();
                return;
            case 3:
                this.f32158b.f33567b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                wg0 wg0Var3 = this.f32158b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) wg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                wg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
