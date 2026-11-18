package org.telegram.ui;
public final class c31 implements Runnable {
    public final int f46376a;
    public final o31 f46377b;

    public c31(o31 o31Var, int i7) {
        this.f46376a = i7;
        this.f46377b = o31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46376a;
        o31 o31Var = this.f46377b;
        switch (i7) {
            case 0:
                org.telegram.messenger.mp.u1(o31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.gd.M0(2131752143, null));
                return;
            default:
                o31Var.f50446c.f34607g3.O(true);
                return;
        }
    }
}
