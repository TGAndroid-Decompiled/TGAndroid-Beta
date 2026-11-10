package org.telegram.ui;
public final class d31 implements Runnable {
    public final int f44893a;
    public final o31 f44894b;

    public d31(o31 o31Var, int i7) {
        this.f44893a = i7;
        this.f44894b = o31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44893a;
        o31 o31Var = this.f44894b;
        switch (i7) {
            case 0:
                org.telegram.messenger.qp.s1(o31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.id.M0(2131752154, null));
                return;
            default:
                o31Var.f48412c.f37496f3.O(true);
                return;
        }
    }
}
