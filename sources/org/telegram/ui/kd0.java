package org.telegram.ui;
public final class kd0 implements Runnable {
    public final int f47277a;
    public final od0 f47278b;

    public kd0(od0 od0Var, int i7) {
        this.f47277a = i7;
        this.f47278b = od0Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f47277a;
        od0 od0Var = this.f47278b;
        switch (i10) {
            case 0:
                od0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                fe0 fe0Var = od0Var.f48509w;
                i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                fe0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                fe0 fe0Var2 = od0Var.f48509w;
                fe0Var2.M1(0, true, null, true);
                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                return;
            case 3:
                fe0 fe0Var3 = od0Var.f48509w;
                fe0Var3.M1(0, true, null, true);
                fe0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                return;
            default:
                od0Var.f48502b.setLoading(false);
                return;
        }
    }
}
