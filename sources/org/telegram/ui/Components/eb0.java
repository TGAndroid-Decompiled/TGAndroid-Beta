package org.telegram.ui.Components;
public final class eb0 implements Runnable {
    public final int f26542a;
    public final sb0 f26543b;

    public eb0(sb0 sb0Var, int i10) {
        this.f26542a = i10;
        this.f26543b = sb0Var;
    }

    @Override
    public final void run() {
        switch (this.f26542a) {
            case 0:
                sb0 sb0Var = this.f26543b;
                kb0 kb0Var = sb0Var.f31031f;
                if (sb0Var.W.d.webpageTop) {
                    kb0Var.w0(-kb0Var.computeVerticalScrollOffset(), 250, xh.n.V);
                    return;
                }
                kb0Var.w0(kb0Var.computeVerticalScrollRange() - (kb0Var.computeVerticalScrollExtent() + kb0Var.computeVerticalScrollOffset()), 250, xh.n.V);
                return;
            default:
                this.f26543b.g(true, false);
                return;
        }
    }
}
