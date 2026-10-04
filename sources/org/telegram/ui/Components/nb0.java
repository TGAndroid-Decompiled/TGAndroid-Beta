package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public final int f28924a;
    public final cc0 f28925b;

    public nb0(cc0 cc0Var, int i10) {
        this.f28924a = i10;
        this.f28925b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f28924a) {
            case 0:
                cc0 cc0Var = this.f28925b;
                ub0 ub0Var = cc0Var.f25323f;
                if (cc0Var.f25321c0.d.webpageTop) {
                    ub0Var.x0(-ub0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ub0Var.x0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f28925b.g(true, false);
                return;
        }
    }
}
