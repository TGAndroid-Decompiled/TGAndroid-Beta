package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gg0 implements Runnable {
    public final int f36393a;
    public final kg0 f36394b;

    public gg0(kg0 kg0Var, int i10) {
        this.f36393a = i10;
        this.f36394b = kg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36393a) {
            case 0:
                bh0 bh0Var = this.f36394b.v;
                bh0Var.u1(0, true, null, true);
                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                bh0 bh0Var2 = this.f36394b.v;
                bh0Var2.u1(0, true, null, true);
                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f36394b.p();
                return;
            case 3:
                this.f36394b.f37647b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                bh0 bh0Var3 = this.f36394b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) bh0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                bh0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}
