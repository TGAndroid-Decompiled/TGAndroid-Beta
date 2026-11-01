package org.telegram.ui;
public final class p41 implements Runnable {
    public final int f40369a;
    public final c51 f40370b;

    public p41(c51 c51Var, int i10) {
        this.f40369a = i10;
        this.f40370b = c51Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40369a;
        c51 c51Var = this.f40370b;
        switch (i10) {
            case 0:
                org.telegram.messenger.wp.r1(c51Var.currentAccount).l0(null);
                return;
            case 1:
                gf.f.r(c51Var.getParentActivity(), org.telegram.messenger.dd.L0(2131752154, null));
                return;
            default:
                c51Var.f36189c.f31183f3.O(true);
                return;
        }
    }
}
