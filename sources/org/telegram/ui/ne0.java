package org.telegram.ui;
public final class ne0 implements Runnable {
    public final int f39920a;
    public final se0 f39921b;

    public ne0(se0 se0Var, int i10) {
        this.f39920a = i10;
        this.f39921b = se0Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39920a;
        se0 se0Var = this.f39921b;
        switch (i11) {
            case 0:
                se0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                hf0 hf0Var = se0Var.f41491w;
                i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                hf0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                hf0 hf0Var2 = se0Var.f41491w;
                hf0Var2.C1(0, true, null, true);
                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                return;
            case 3:
                hf0 hf0Var3 = se0Var.f41491w;
                hf0Var3.C1(0, true, null, true);
                hf0Var3.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                return;
            default:
                se0Var.f41485b.setLoading(false);
                return;
        }
    }
}
