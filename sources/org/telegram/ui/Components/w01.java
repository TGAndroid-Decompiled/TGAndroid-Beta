package org.telegram.ui.Components;
public final class w01 implements Runnable {
    public final int f39854a;
    public final m11 f39855b;

    public w01(m11 m11Var, int i7) {
        this.f39854a = i7;
        this.f39855b = m11Var;
    }

    @Override
    public final void run() {
        switch (this.f39854a) {
            case 0:
                m11 m11Var = this.f39855b;
                if (m11Var.l()) {
                    m11Var.m();
                    return;
                }
                return;
            default:
                m11 m11Var2 = this.f39855b;
                b11 b11Var = m11Var2.J;
                b11Var.z1(true);
                z01 z01Var = m11Var2.f35815y;
                z01Var.z1(true);
                m11Var2.M.a(true, true);
                org.telegram.messenger.g0.b4(z01Var);
                org.telegram.messenger.g0.b4(b11Var);
                return;
        }
    }
}
