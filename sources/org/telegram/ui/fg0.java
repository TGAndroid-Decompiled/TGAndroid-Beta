package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fg0 implements Runnable {
    public final int f35528a;
    public final jg0 f35529b;

    public fg0(jg0 jg0Var, int i10) {
        this.f35528a = i10;
        this.f35529b = jg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35528a) {
            case 0:
                ah0 ah0Var = this.f35529b.v;
                ah0Var.u1(0, true, null, true);
                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                ah0 ah0Var2 = this.f35529b.v;
                ah0Var2.u1(0, true, null, true);
                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f35529b.p();
                return;
            case 3:
                this.f35529b.f37049b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ah0 ah0Var3 = this.f35529b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) ah0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ah0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
