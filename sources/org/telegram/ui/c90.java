package org.telegram.ui;
public final class c90 implements Runnable {
    public final int f46466a;
    public final j90 f46467b;

    public c90(j90 j90Var, int i7) {
        this.f46466a = i7;
        this.f46467b = j90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46466a;
        j90 j90Var = this.f46467b;
        switch (i7) {
            case 0:
                vf.c.t(j90Var.getParentActivity(), org.telegram.messenger.gd.M0(2131745961, null));
                return;
            case 1:
                j90Var.f48922r.d.requestFocus();
                org.telegram.messenger.g0.I3(j90Var.f48922r.d);
                return;
            default:
                j90Var.f48922r.d.clearFocus();
                org.telegram.messenger.g0.v1(j90Var.f48922r.d);
                return;
        }
    }
}
