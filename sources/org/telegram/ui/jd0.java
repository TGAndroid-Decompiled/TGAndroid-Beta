package org.telegram.ui;
public final class jd0 implements Runnable {
    public final int f46938a;
    public final nd0 f46939b;

    public jd0(nd0 nd0Var, int i7) {
        this.f46938a = i7;
        this.f46939b = nd0Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f46938a;
        nd0 nd0Var = this.f46939b;
        switch (i10) {
            case 0:
                nd0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ee0 ee0Var = nd0Var.f48173w;
                i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ee0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                ee0 ee0Var2 = nd0Var.f48173w;
                ee0Var2.M1(0, true, null, true);
                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                return;
            case 3:
                ee0 ee0Var3 = nd0Var.f48173w;
                ee0Var3.M1(0, true, null, true);
                ee0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                return;
            default:
                nd0Var.f48166b.setLoading(false);
                return;
        }
    }
}
