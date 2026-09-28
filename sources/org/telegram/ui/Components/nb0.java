package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public final int f26734a;
    public final bc0 f26735b;

    public nb0(bc0 bc0Var, int i10) {
        this.f26734a = i10;
        this.f26735b = bc0Var;
    }

    @Override
    public final void run() {
        switch (this.f26734a) {
            case 0:
                bc0 bc0Var = this.f26735b;
                ub0 ub0Var = bc0Var.f22951f;
                if (bc0Var.f22950c0.d.webpageTop) {
                    ub0Var.w0(-ub0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ub0Var.w0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26735b.g(true, false);
                return;
        }
    }
}
