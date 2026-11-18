package org.telegram.ui.Components;
public final class j11 implements Runnable {
    public final int f36296a;
    public final z11 f36297b;

    public j11(z11 z11Var, int i7) {
        this.f36296a = i7;
        this.f36297b = z11Var;
    }

    @Override
    public final void run() {
        switch (this.f36296a) {
            case 0:
                z11 z11Var = this.f36297b;
                if (z11Var.l()) {
                    z11Var.m();
                    return;
                }
                return;
            default:
                z11 z11Var2 = this.f36297b;
                o11 o11Var = z11Var2.K;
                o11Var.z1(true);
                m11 m11Var = z11Var2.f42750y;
                m11Var.z1(true);
                z11Var2.N.a(true, true);
                org.telegram.messenger.g0.Z3(m11Var);
                org.telegram.messenger.g0.Z3(o11Var);
                return;
        }
    }
}
