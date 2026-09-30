package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public final int f26733a;
    public final bc0 f26734b;

    public nb0(bc0 bc0Var, int i10) {
        this.f26733a = i10;
        this.f26734b = bc0Var;
    }

    @Override
    public final void run() {
        switch (this.f26733a) {
            case 0:
                bc0 bc0Var = this.f26734b;
                ub0 ub0Var = bc0Var.f22939f;
                if (bc0Var.f22938c0.d.webpageTop) {
                    ub0Var.w0(-ub0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ub0Var.w0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26734b.g(true, false);
                return;
        }
    }
}
