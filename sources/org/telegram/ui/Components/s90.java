package org.telegram.ui.Components;
public final class s90 implements Runnable {
    public final int f37960a;
    public final ca0 f37961b;

    public s90(ca0 ca0Var, int i7) {
        this.f37960a = i7;
        this.f37961b = ca0Var;
    }

    @Override
    public final void run() {
        switch (this.f37960a) {
            case 0:
                ca0 ca0Var = this.f37961b;
                bi.q1 q1Var = ca0Var.f32527f;
                if (ca0Var.f32525c0.d.f24045r) {
                    q1Var.x0(-q1Var.computeVerticalScrollOffset(), 250, mi.l.V);
                    return;
                }
                q1Var.x0(q1Var.computeVerticalScrollRange() - (q1Var.computeVerticalScrollExtent() + q1Var.computeVerticalScrollOffset()), 250, mi.l.V);
                return;
            default:
                this.f37961b.h(true, false);
                return;
        }
    }
}
