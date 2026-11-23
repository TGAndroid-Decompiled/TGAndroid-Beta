package org.telegram.ui;
public final class hd0 implements Runnable {
    public final int f48380a;
    public final ld0 f48381b;

    public hd0(ld0 ld0Var, int i7) {
        this.f48380a = i7;
        this.f48381b = ld0Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f48380a;
        ld0 ld0Var = this.f48381b;
        switch (i10) {
            case 0:
                ld0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                de0 de0Var = ld0Var.f49601w;
                i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                de0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                de0 de0Var2 = ld0Var.f49601w;
                de0Var2.M1(0, true, null, true);
                de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, null));
                return;
            case 3:
                de0 de0Var3 = ld0Var.f49601w;
                de0Var3.M1(0, true, null, true);
                de0Var3.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, null));
                return;
            default:
                ld0Var.f49594b.setLoading(false);
                return;
        }
    }
}
