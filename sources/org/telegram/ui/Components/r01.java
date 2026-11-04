package org.telegram.ui.Components;
public final class r01 implements Runnable {
    public final int f37591a;
    public final g11 f37592b;

    public r01(g11 g11Var, int i3) {
        this.f37591a = i3;
        this.f37592b = g11Var;
    }

    @Override
    public final void run() {
        switch (this.f37591a) {
            case 0:
                g11 g11Var = this.f37592b;
                if (g11Var.l()) {
                    g11Var.m();
                    return;
                }
                return;
            default:
                g11 g11Var2 = this.f37592b;
                w01 w01Var = g11Var2.K;
                w01Var.z1(true);
                u01 u01Var = g11Var2.f33940y;
                u01Var.z1(true);
                g11Var2.N.a(true, true);
                org.telegram.messenger.g0.b4(u01Var);
                org.telegram.messenger.g0.b4(w01Var);
                return;
        }
    }
}
