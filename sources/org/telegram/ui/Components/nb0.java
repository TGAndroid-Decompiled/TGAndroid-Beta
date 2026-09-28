package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public final int f26735a;
    public final bc0 f26736b;

    public nb0(bc0 bc0Var, int i10) {
        this.f26735a = i10;
        this.f26736b = bc0Var;
    }

    @Override
    public final void run() {
        switch (this.f26735a) {
            case 0:
                bc0 bc0Var = this.f26736b;
                ub0 ub0Var = bc0Var.f22952f;
                if (bc0Var.f22951c0.d.webpageTop) {
                    ub0Var.w0(-ub0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ub0Var.w0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26736b.g(true, false);
                return;
        }
    }
}
