package org.telegram.ui.Components;
public final class z01 implements Runnable {
    public final int f42206a;
    public final p11 f42207b;

    public z01(p11 p11Var, int i7) {
        this.f42206a = i7;
        this.f42207b = p11Var;
    }

    @Override
    public final void run() {
        switch (this.f42206a) {
            case 0:
                p11 p11Var = this.f42207b;
                if (p11Var.l()) {
                    p11Var.m();
                    return;
                }
                return;
            default:
                p11 p11Var2 = this.f42207b;
                e11 e11Var = p11Var2.K;
                e11Var.z1(true);
                c11 c11Var = p11Var2.f38167y;
                c11Var.z1(true);
                p11Var2.N.a(true, true);
                org.telegram.messenger.g0.a4(c11Var);
                org.telegram.messenger.g0.a4(e11Var);
                return;
        }
    }
}
