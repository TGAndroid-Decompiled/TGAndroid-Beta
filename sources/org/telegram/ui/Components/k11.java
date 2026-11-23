package org.telegram.ui.Components;
public final class k11 implements Runnable {
    public final int f36712a;
    public final a21 f36713b;

    public k11(a21 a21Var, int i7) {
        this.f36712a = i7;
        this.f36713b = a21Var;
    }

    @Override
    public final void run() {
        switch (this.f36712a) {
            case 0:
                a21 a21Var = this.f36713b;
                if (a21Var.l()) {
                    a21Var.m();
                    return;
                }
                return;
            default:
                a21 a21Var2 = this.f36713b;
                p11 p11Var = a21Var2.K;
                p11Var.z1(true);
                n11 n11Var = a21Var2.f33268y;
                n11Var.z1(true);
                a21Var2.N.a(true, true);
                org.telegram.messenger.g0.Z3(n11Var);
                org.telegram.messenger.g0.Z3(p11Var);
                return;
        }
    }
}
