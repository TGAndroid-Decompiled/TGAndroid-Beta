package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f48738a;
    public final c31 f48739b;

    public q21(c31 c31Var, int i3) {
        this.f48738a = i3;
        this.f48739b = c31Var;
    }

    @Override
    public final void run() {
        int i3 = this.f48738a;
        c31 c31Var = this.f48739b;
        switch (i3) {
            case 0:
                org.telegram.messenger.hp.s1(c31Var.currentAccount).l0(null);
                return;
            case 1:
                sf.c.t(c31Var.getParentActivity(), org.telegram.messenger.bd.M0(2131752154, null));
                return;
            default:
                c31Var.f44218c.f35594g3.O(true);
                return;
        }
    }
}
