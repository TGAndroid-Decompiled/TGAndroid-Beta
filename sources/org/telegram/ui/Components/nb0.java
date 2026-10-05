package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public final int f29018a;
    public final cc0 f29019b;

    public nb0(cc0 cc0Var, int i10) {
        this.f29018a = i10;
        this.f29019b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f29018a) {
            case 0:
                cc0 cc0Var = this.f29019b;
                ub0 ub0Var = cc0Var.f25376f;
                if (cc0Var.f25374c0.d.webpageTop) {
                    ub0Var.x0(-ub0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ub0Var.x0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f29019b.g(true, false);
                return;
        }
    }
}
