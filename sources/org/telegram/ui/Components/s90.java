package org.telegram.ui.Components;
public final class s90 implements Runnable {
    public final int f37944a;
    public final ca0 f37945b;

    public s90(ca0 ca0Var, int i7) {
        this.f37944a = i7;
        this.f37945b = ca0Var;
    }

    @Override
    public final void run() {
        switch (this.f37944a) {
            case 0:
                ca0 ca0Var = this.f37945b;
                bi.q1 q1Var = ca0Var.f32496f;
                if (ca0Var.f32494c0.d.f24040r) {
                    q1Var.x0(-q1Var.computeVerticalScrollOffset(), 250, mi.l.V);
                    return;
                }
                q1Var.x0(q1Var.computeVerticalScrollRange() - (q1Var.computeVerticalScrollExtent() + q1Var.computeVerticalScrollOffset()), 250, mi.l.V);
                return;
            default:
                this.f37945b.h(true, false);
                return;
        }
    }
}
