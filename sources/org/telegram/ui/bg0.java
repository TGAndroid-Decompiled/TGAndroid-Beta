package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bg0 implements Runnable {
    public final int f36168a;
    public final gg0 f36169b;

    public bg0(gg0 gg0Var, int i10) {
        this.f36168a = i10;
        this.f36169b = gg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36168a) {
            case 0:
                xg0 xg0Var = this.f36169b.v;
                xg0Var.u1(0, true, null, true);
                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                xg0 xg0Var2 = this.f36169b.v;
                xg0Var2.u1(0, true, null, true);
                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f36169b.p();
                return;
            case 3:
                this.f36169b.f38040b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                xg0 xg0Var3 = this.f36169b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) xg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                xg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
