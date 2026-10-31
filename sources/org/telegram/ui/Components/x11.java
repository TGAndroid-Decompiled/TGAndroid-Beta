package org.telegram.ui.Components;
public final class x11 implements Runnable {
    public final int f32300a;
    public final o21 f32301b;

    public x11(o21 o21Var, int i10) {
        this.f32300a = i10;
        this.f32301b = o21Var;
    }

    @Override
    public final void run() {
        switch (this.f32300a) {
            case 0:
                o21 o21Var = this.f32301b;
                if (o21Var.l()) {
                    o21Var.m();
                    return;
                }
                return;
            default:
                o21 o21Var2 = this.f32301b;
                e21 e21Var = o21Var2.M;
                e21Var.z1(true);
                c21 c21Var = o21Var2.F;
                c21Var.z1(true);
                o21Var2.P.a(true, true);
                org.telegram.messenger.i0.a4(c21Var);
                org.telegram.messenger.i0.a4(e21Var);
                return;
        }
    }
}
