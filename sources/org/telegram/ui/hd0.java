package org.telegram.ui;
public final class hd0 implements Runnable {
    public final int f46333a;
    public final ld0 f46334b;

    public hd0(ld0 ld0Var, int i7) {
        this.f46333a = i7;
        this.f46334b = ld0Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f46333a;
        ld0 ld0Var = this.f46334b;
        switch (i10) {
            case 0:
                ld0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ce0 ce0Var = ld0Var.f47499w;
                i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ce0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                ce0 ce0Var2 = ld0Var.f47499w;
                ce0Var2.M1(0, true, null, true);
                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, null));
                return;
            case 3:
                ce0 ce0Var3 = ld0Var.f47499w;
                ce0Var3.M1(0, true, null, true);
                ce0Var3.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, null));
                return;
            default:
                ld0Var.f47492b.setLoading(false);
                return;
        }
    }
}
