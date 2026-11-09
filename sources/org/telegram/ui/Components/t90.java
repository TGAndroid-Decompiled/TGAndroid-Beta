package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f38331a;
    public final da0 f38332b;

    public t90(da0 da0Var, int i7) {
        this.f38331a = i7;
        this.f38332b = da0Var;
    }

    @Override
    public final void run() {
        switch (this.f38331a) {
            case 0:
                da0 da0Var = this.f38332b;
                bi.q1 q1Var = da0Var.f32922f;
                if (da0Var.f32920c0.d.f24045r) {
                    q1Var.x0(-q1Var.computeVerticalScrollOffset(), 250, mi.l.V);
                    return;
                }
                q1Var.x0(q1Var.computeVerticalScrollRange() - (q1Var.computeVerticalScrollExtent() + q1Var.computeVerticalScrollOffset()), 250, mi.l.V);
                return;
            default:
                this.f38332b.h(true, false);
                return;
        }
    }
}
