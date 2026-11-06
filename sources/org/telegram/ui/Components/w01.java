package org.telegram.ui.Components;
public final class w01 implements Runnable {
    public final int f39818a;
    public final m11 f39819b;

    public w01(m11 m11Var, int i7) {
        this.f39818a = i7;
        this.f39819b = m11Var;
    }

    @Override
    public final void run() {
        switch (this.f39818a) {
            case 0:
                m11 m11Var = this.f39819b;
                if (m11Var.l()) {
                    m11Var.m();
                    return;
                }
                return;
            default:
                m11 m11Var2 = this.f39819b;
                b11 b11Var = m11Var2.J;
                b11Var.z1(true);
                z01 z01Var = m11Var2.f35836y;
                z01Var.z1(true);
                m11Var2.M.a(true, true);
                org.telegram.messenger.g0.b4(z01Var);
                org.telegram.messenger.g0.b4(b11Var);
                return;
        }
    }
}
