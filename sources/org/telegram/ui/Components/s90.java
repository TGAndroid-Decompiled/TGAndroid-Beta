package org.telegram.ui.Components;
public final class s90 implements Runnable {
    public final int f37905a;
    public final ca0 f37906b;

    public s90(ca0 ca0Var, int i7) {
        this.f37905a = i7;
        this.f37906b = ca0Var;
    }

    @Override
    public final void run() {
        switch (this.f37905a) {
            case 0:
                ca0 ca0Var = this.f37906b;
                bi.q1 q1Var = ca0Var.f32526f;
                if (ca0Var.f32524c0.d.f24049r) {
                    q1Var.x0(-q1Var.computeVerticalScrollOffset(), 250, mi.l.V);
                    return;
                }
                q1Var.x0(q1Var.computeVerticalScrollRange() - (q1Var.computeVerticalScrollExtent() + q1Var.computeVerticalScrollOffset()), 250, mi.l.V);
                return;
            default:
                this.f37906b.h(true, false);
                return;
        }
    }
}
