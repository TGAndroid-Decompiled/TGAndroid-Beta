package org.telegram.ui;
public final class c31 implements Runnable {
    public final int f46386a;
    public final o31 f46387b;

    public c31(o31 o31Var, int i7) {
        this.f46386a = i7;
        this.f46387b = o31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46386a;
        o31 o31Var = this.f46387b;
        switch (i7) {
            case 0:
                org.telegram.messenger.np.u1(o31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.hd.N0(2131752142, null));
                return;
            default:
                o31Var.f50444c.f35742g3.O(true);
                return;
        }
    }
}
