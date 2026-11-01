package org.telegram.ui.Components;
public final class y11 implements Runnable {
    public final int f32697a;
    public final p21 f32698b;

    public y11(p21 p21Var, int i10) {
        this.f32697a = i10;
        this.f32698b = p21Var;
    }

    @Override
    public final void run() {
        switch (this.f32697a) {
            case 0:
                p21 p21Var = this.f32698b;
                if (p21Var.l()) {
                    p21Var.m();
                    return;
                }
                return;
            default:
                p21 p21Var2 = this.f32698b;
                f21 f21Var = p21Var2.J;
                f21Var.z1(true);
                d21 d21Var = p21Var2.f29342y;
                d21Var.z1(true);
                p21Var2.M.a(true, true);
                org.telegram.messenger.i0.a4(d21Var);
                org.telegram.messenger.i0.a4(f21Var);
                return;
        }
    }
}
