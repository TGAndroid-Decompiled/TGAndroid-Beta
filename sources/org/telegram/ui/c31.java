package org.telegram.ui;
public final class c31 implements Runnable {
    public final int f46399a;
    public final o31 f46400b;

    public c31(o31 o31Var, int i7) {
        this.f46399a = i7;
        this.f46400b = o31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46399a;
        o31 o31Var = this.f46400b;
        switch (i7) {
            case 0:
                org.telegram.messenger.mp.u1(o31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131752142, null));
                return;
            default:
                o31Var.f50451c.f35796g3.O(true);
                return;
        }
    }
}
