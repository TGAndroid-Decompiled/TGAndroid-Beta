package org.telegram.ui;
public final class d90 implements Runnable {
    public final int f46905a;
    public final k90 f46906b;

    public d90(k90 k90Var, int i7) {
        this.f46905a = i7;
        this.f46906b = k90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46905a;
        k90 k90Var = this.f46906b;
        switch (i7) {
            case 0:
                vf.c.t(k90Var.getParentActivity(), org.telegram.messenger.hd.N0(2131745960, null));
                return;
            case 1:
                k90Var.f49256r.d.requestFocus();
                org.telegram.messenger.g0.I3(k90Var.f49256r.d);
                return;
            default:
                k90Var.f49256r.d.clearFocus();
                org.telegram.messenger.g0.v1(k90Var.f49256r.d);
                return;
        }
    }
}
