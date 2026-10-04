package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public final int f28923a;
    public final cc0 f28924b;

    public nb0(cc0 cc0Var, int i10) {
        this.f28923a = i10;
        this.f28924b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f28923a) {
            case 0:
                cc0 cc0Var = this.f28924b;
                ub0 ub0Var = cc0Var.f25322f;
                if (cc0Var.f25320c0.d.webpageTop) {
                    ub0Var.x0(-ub0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ub0Var.x0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f28924b.g(true, false);
                return;
        }
    }
}
