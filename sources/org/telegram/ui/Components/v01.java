package org.telegram.ui.Components;
public final class v01 implements Runnable {
    public final int f38779a;
    public final l11 f38780b;

    public v01(l11 l11Var, int i7) {
        this.f38779a = i7;
        this.f38780b = l11Var;
    }

    @Override
    public final void run() {
        switch (this.f38779a) {
            case 0:
                l11 l11Var = this.f38780b;
                if (l11Var.l()) {
                    l11Var.m();
                    return;
                }
                return;
            default:
                l11 l11Var2 = this.f38780b;
                a11 a11Var = l11Var2.J;
                a11Var.z1(true);
                y01 y01Var = l11Var2.f35499y;
                y01Var.z1(true);
                l11Var2.M.a(true, true);
                org.telegram.messenger.g0.b4(y01Var);
                org.telegram.messenger.g0.b4(a11Var);
                return;
        }
    }
}
