package org.telegram.ui;
public final class c90 implements Runnable {
    public final int f44252a;
    public final j90 f44253b;

    public c90(j90 j90Var, int i7) {
        this.f44252a = i7;
        this.f44253b = j90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44252a;
        j90 j90Var = this.f44253b;
        switch (i7) {
            case 0:
                vf.c.t(j90Var.getParentActivity(), org.telegram.messenger.id.M0(2131746156, null));
                return;
            case 1:
                j90Var.f46892r.d.requestFocus();
                org.telegram.messenger.g0.K3(j90Var.f46892r.d);
                return;
            default:
                j90Var.f46892r.d.clearFocus();
                org.telegram.messenger.g0.v1(j90Var.f46892r.d);
                return;
        }
    }
}
