package org.telegram.ui;
public final class c90 implements Runnable {
    public final int f46746a;
    public final j90 f46747b;

    public c90(j90 j90Var, int i7) {
        this.f46746a = i7;
        this.f46747b = j90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46746a;
        j90 j90Var = this.f46747b;
        switch (i7) {
            case 0:
                vf.c.t(j90Var.getParentActivity(), org.telegram.messenger.gd.N0(2131745960, null));
                return;
            case 1:
                j90Var.f49065r.d.requestFocus();
                org.telegram.messenger.g0.I3(j90Var.f49065r.d);
                return;
            default:
                j90Var.f49065r.d.clearFocus();
                org.telegram.messenger.g0.v1(j90Var.f49065r.d);
                return;
        }
    }
}
