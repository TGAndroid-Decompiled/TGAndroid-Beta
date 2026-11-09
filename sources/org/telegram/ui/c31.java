package org.telegram.ui;
public final class c31 implements Runnable {
    public final int f44204a;
    public final n31 f44205b;

    public c31(n31 n31Var, int i7) {
        this.f44204a = i7;
        this.f44205b = n31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44204a;
        n31 n31Var = this.f44205b;
        switch (i7) {
            case 0:
                org.telegram.messenger.qp.s1(n31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.id.M0(2131752154, null));
                return;
            default:
                n31Var.f48078c.f37556f3.O(true);
                return;
        }
    }
}
