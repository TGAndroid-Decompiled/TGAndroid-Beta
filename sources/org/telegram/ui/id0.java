package org.telegram.ui;
public final class id0 implements Runnable {
    public final int f48707a;
    public final md0 f48708b;

    public id0(md0 md0Var, int i7) {
        this.f48707a = i7;
        this.f48708b = md0Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f48707a;
        md0 md0Var = this.f48708b;
        switch (i10) {
            case 0:
                md0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ee0 ee0Var = md0Var.f49816w;
                i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ee0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                ee0 ee0Var2 = md0Var.f49816w;
                ee0Var2.M1(0, true, null, true);
                ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                return;
            case 3:
                ee0 ee0Var3 = md0Var.f49816w;
                ee0Var3.M1(0, true, null, true);
                ee0Var3.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                return;
            default:
                md0Var.f49809b.setLoading(false);
                return;
        }
    }
}
