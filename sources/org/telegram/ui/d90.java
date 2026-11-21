package org.telegram.ui;
public final class d90 implements Runnable {
    public final int f46902a;
    public final k90 f46903b;

    public d90(k90 k90Var, int i7) {
        this.f46902a = i7;
        this.f46903b = k90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46902a;
        k90 k90Var = this.f46903b;
        switch (i7) {
            case 0:
                vf.c.t(k90Var.getParentActivity(), org.telegram.messenger.gd.N0(2131745960, null));
                return;
            case 1:
                k90Var.f49252r.d.requestFocus();
                org.telegram.messenger.g0.I3(k90Var.f49252r.d);
                return;
            default:
                k90Var.f49252r.d.clearFocus();
                org.telegram.messenger.g0.v1(k90Var.f49252r.d);
                return;
        }
    }
}
