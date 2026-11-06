package org.telegram.ui.Components;
public final class s90 implements Runnable {
    public final int f37940a;
    public final ca0 f37941b;

    public s90(ca0 ca0Var, int i7) {
        this.f37940a = i7;
        this.f37941b = ca0Var;
    }

    @Override
    public final void run() {
        switch (this.f37940a) {
            case 0:
                ca0 ca0Var = this.f37941b;
                bi.q1 q1Var = ca0Var.f32509f;
                if (ca0Var.f32507c0.d.f24033r) {
                    q1Var.x0(-q1Var.computeVerticalScrollOffset(), 250, mi.l.V);
                    return;
                }
                q1Var.x0(q1Var.computeVerticalScrollRange() - (q1Var.computeVerticalScrollExtent() + q1Var.computeVerticalScrollOffset()), 250, mi.l.V);
                return;
            default:
                this.f37941b.h(true, false);
                return;
        }
    }
}
