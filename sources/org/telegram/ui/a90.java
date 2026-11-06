package org.telegram.ui;
public final class a90 implements Runnable {
    public final int f43603a;
    public final h90 f43604b;

    public a90(h90 h90Var, int i7) {
        this.f43603a = i7;
        this.f43604b = h90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43603a;
        h90 h90Var = this.f43604b;
        switch (i7) {
            case 0:
                vf.c.t(h90Var.getParentActivity(), org.telegram.messenger.hd.M0(2131746157, null));
                return;
            case 1:
                h90Var.f46302r.d.requestFocus();
                org.telegram.messenger.g0.K3(h90Var.f46302r.d);
                return;
            default:
                h90Var.f46302r.d.clearFocus();
                org.telegram.messenger.g0.v1(h90Var.f46302r.d);
                return;
        }
    }
}
