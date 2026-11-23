package org.telegram.ui;
public final class b31 implements Runnable {
    public final int f45897a;
    public final n31 f45898b;

    public b31(n31 n31Var, int i7) {
        this.f45897a = i7;
        this.f45898b = n31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45897a;
        n31 n31Var = this.f45898b;
        switch (i7) {
            case 0:
                org.telegram.messenger.mp.u1(n31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131752142, null));
                return;
            default:
                n31Var.f50192c.f35323g3.O(true);
                return;
        }
    }
}
