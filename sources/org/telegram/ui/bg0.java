package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bg0 implements Runnable {
    public final int f31257a;
    public final fg0 f31258b;

    public bg0(fg0 fg0Var, int i10) {
        this.f31257a = i10;
        this.f31258b = fg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f31257a) {
            case 0:
                xg0 xg0Var = this.f31258b.v;
                xg0Var.u1(0, true, null, true);
                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                xg0 xg0Var2 = this.f31258b.v;
                xg0Var2.u1(0, true, null, true);
                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f31258b.p();
                return;
            case 3:
                this.f31258b.f32813b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                xg0 xg0Var3 = this.f31258b.v;
                i10 = ((org.telegram.ui.ActionBar.p2) xg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                xg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
