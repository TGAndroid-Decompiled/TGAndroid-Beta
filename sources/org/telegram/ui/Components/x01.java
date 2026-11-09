package org.telegram.ui.Components;
public final class x01 implements Runnable {
    public final int f40270a;
    public final n11 f40271b;

    public x01(n11 n11Var, int i7) {
        this.f40270a = i7;
        this.f40271b = n11Var;
    }

    @Override
    public final void run() {
        switch (this.f40270a) {
            case 0:
                n11 n11Var = this.f40271b;
                if (n11Var.l()) {
                    n11Var.m();
                    return;
                }
                return;
            default:
                n11 n11Var2 = this.f40271b;
                c11 c11Var = n11Var2.J;
                c11Var.z1(true);
                a11 a11Var = n11Var2.f36222y;
                a11Var.z1(true);
                n11Var2.M.a(true, true);
                org.telegram.messenger.g0.b4(a11Var);
                org.telegram.messenger.g0.b4(c11Var);
                return;
        }
    }
}
