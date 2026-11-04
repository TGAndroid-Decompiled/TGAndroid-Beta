package org.telegram.ui;
public final class ed0 implements Runnable {
    public final int f44967a;
    public final id0 f44968b;

    public ed0(id0 id0Var, int i3) {
        this.f44967a = i3;
        this.f44968b = id0Var;
    }

    @Override
    public final void run() {
        int i3;
        int i10 = this.f44967a;
        id0 id0Var = this.f44968b;
        switch (i10) {
            case 0:
                id0Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                xd0 xd0Var = id0Var.f46252w;
                i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i3);
                xd0Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                xd0 xd0Var2 = id0Var.f46252w;
                xd0Var2.D1(0, true, null, true);
                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                return;
            case 3:
                xd0 xd0Var3 = id0Var.f46252w;
                xd0Var3.D1(0, true, null, true);
                xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                return;
            default:
                id0Var.f46245b.setLoading(false);
                return;
        }
    }
}
