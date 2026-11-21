package org.telegram.ui.Components;
public final class l11 implements Runnable {
    public final int f37067a;
    public final b21 f37068b;

    public l11(b21 b21Var, int i7) {
        this.f37067a = i7;
        this.f37068b = b21Var;
    }

    @Override
    public final void run() {
        switch (this.f37067a) {
            case 0:
                b21 b21Var = this.f37068b;
                if (b21Var.l()) {
                    b21Var.m();
                    return;
                }
                return;
            default:
                b21 b21Var2 = this.f37068b;
                q11 q11Var = b21Var2.K;
                q11Var.z1(true);
                o11 o11Var = b21Var2.f33725y;
                o11Var.z1(true);
                b21Var2.N.a(true, true);
                org.telegram.messenger.g0.Z3(o11Var);
                org.telegram.messenger.g0.Z3(q11Var);
                return;
        }
    }
}
