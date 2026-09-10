package org.telegram.ui.Components;
public final class kb0 implements Runnable {
    public final int f24691a;
    public final yb0 f24692b;

    public kb0(yb0 yb0Var, int i10) {
        this.f24691a = i10;
        this.f24692b = yb0Var;
    }

    @Override
    public final void run() {
        switch (this.f24691a) {
            case 0:
                yb0 yb0Var = this.f24692b;
                rb0 rb0Var = yb0Var.f29296f;
                if (yb0Var.f29295c0.d.webpageTop) {
                    rb0Var.w0(-rb0Var.computeVerticalScrollOffset(), 250, ii.n.V);
                    return;
                }
                rb0Var.w0(rb0Var.computeVerticalScrollRange() - (rb0Var.computeVerticalScrollExtent() + rb0Var.computeVerticalScrollOffset()), 250, ii.n.V);
                return;
            default:
                this.f24692b.g(true, false);
                return;
        }
    }
}
