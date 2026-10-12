package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bg0 implements Runnable {
    public final int f36166a;
    public final fg0 f36167b;

    public bg0(fg0 fg0Var, int i10) {
        this.f36166a = i10;
        this.f36167b = fg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36166a) {
            case 0:
                xg0 xg0Var = this.f36167b.v;
                xg0Var.u1(0, true, null, true);
                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                xg0 xg0Var2 = this.f36167b.v;
                xg0Var2.u1(0, true, null, true);
                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f36167b.p();
                return;
            case 3:
                this.f36167b.f37771b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                xg0 xg0Var3 = this.f36167b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) xg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                xg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
