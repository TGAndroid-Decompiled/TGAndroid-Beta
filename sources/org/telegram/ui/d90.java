package org.telegram.ui;
public final class d90 implements Runnable {
    public final int f46845a;
    public final k90 f46846b;

    public d90(k90 k90Var, int i7) {
        this.f46845a = i7;
        this.f46846b = k90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46845a;
        k90 k90Var = this.f46846b;
        switch (i7) {
            case 0:
                vf.c.t(k90Var.getParentActivity(), org.telegram.messenger.gd.M0(2131745961, null));
                return;
            case 1:
                k90Var.f49213r.d.requestFocus();
                org.telegram.messenger.g0.I3(k90Var.f49213r.d);
                return;
            default:
                k90Var.f49213r.d.clearFocus();
                org.telegram.messenger.g0.v1(k90Var.f49213r.d);
                return;
        }
    }
}
