package org.telegram.ui;
public final class me0 implements Runnable {
    public final int f39517a;
    public final re0 f39518b;

    public me0(re0 re0Var, int i10) {
        this.f39517a = i10;
        this.f39518b = re0Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39517a;
        re0 re0Var = this.f39518b;
        switch (i11) {
            case 0:
                re0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                gf0 gf0Var = re0Var.f41074w;
                i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                gf0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                gf0 gf0Var2 = re0Var.f41074w;
                gf0Var2.D1(0, true, null, true);
                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                return;
            case 3:
                gf0 gf0Var3 = re0Var.f41074w;
                gf0Var3.D1(0, true, null, true);
                gf0Var3.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                return;
            default:
                re0Var.f41068b.setLoading(false);
                return;
        }
    }
}
