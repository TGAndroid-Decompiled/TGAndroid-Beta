package org.telegram.ui;
public final class fd0 implements Runnable {
    public final int f47124a;
    public final kd0 f47125b;

    public fd0(kd0 kd0Var, int i7) {
        this.f47124a = i7;
        this.f47125b = kd0Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f47124a;
        kd0 kd0Var = this.f47125b;
        switch (i10) {
            case 0:
                kd0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ce0 ce0Var = kd0Var.f48687w;
                i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ce0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                ce0 ce0Var2 = kd0Var.f48687w;
                ce0Var2.M1(0, true, null, true);
                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                return;
            case 3:
                ce0 ce0Var3 = kd0Var.f48687w;
                ce0Var3.M1(0, true, null, true);
                ce0Var3.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                return;
            default:
                kd0Var.f48680b.setLoading(false);
                return;
        }
    }
}
