package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public final int f28929a;
    public final cc0 f28930b;

    public nb0(cc0 cc0Var, int i10) {
        this.f28929a = i10;
        this.f28930b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f28929a) {
            case 0:
                cc0 cc0Var = this.f28930b;
                ub0 ub0Var = cc0Var.f25328f;
                if (cc0Var.f25326c0.d.webpageTop) {
                    ub0Var.x0(-ub0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ub0Var.x0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f28930b.g(true, false);
                return;
        }
    }
}
