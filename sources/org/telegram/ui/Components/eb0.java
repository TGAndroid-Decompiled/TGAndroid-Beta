package org.telegram.ui.Components;
public final class eb0 implements Runnable {
    public final int f26498a;
    public final sb0 f26499b;

    public eb0(sb0 sb0Var, int i10) {
        this.f26498a = i10;
        this.f26499b = sb0Var;
    }

    @Override
    public final void run() {
        switch (this.f26498a) {
            case 0:
                sb0 sb0Var = this.f26499b;
                kb0 kb0Var = sb0Var.f31031f;
                if (sb0Var.W.d.webpageTop) {
                    kb0Var.w0(-kb0Var.computeVerticalScrollOffset(), 250, xh.n.V);
                    return;
                }
                kb0Var.w0(kb0Var.computeVerticalScrollRange() - (kb0Var.computeVerticalScrollExtent() + kb0Var.computeVerticalScrollOffset()), 250, xh.n.V);
                return;
            default:
                this.f26499b.g(true, false);
                return;
        }
    }
}
