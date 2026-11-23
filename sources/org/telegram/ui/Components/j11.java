package org.telegram.ui.Components;
public final class j11 implements Runnable {
    public final int f36230a;
    public final z11 f36231b;

    public j11(z11 z11Var, int i7) {
        this.f36230a = i7;
        this.f36231b = z11Var;
    }

    @Override
    public final void run() {
        switch (this.f36230a) {
            case 0:
                z11 z11Var = this.f36231b;
                if (z11Var.l()) {
                    z11Var.m();
                    return;
                }
                return;
            default:
                z11 z11Var2 = this.f36231b;
                o11 o11Var = z11Var2.K;
                o11Var.z1(true);
                m11 m11Var = z11Var2.f42645y;
                m11Var.z1(true);
                z11Var2.N.a(true, true);
                org.telegram.messenger.g0.Z3(m11Var);
                org.telegram.messenger.g0.Z3(o11Var);
                return;
        }
    }
}
