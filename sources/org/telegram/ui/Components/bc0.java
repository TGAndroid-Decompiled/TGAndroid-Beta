package org.telegram.ui.Components;
public final class bc0 implements Runnable {
    public final int f24969a;
    public final pc0 f24970b;

    public bc0(pc0 pc0Var, int i10) {
        this.f24969a = i10;
        this.f24970b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f24969a) {
            case 0:
                pc0 pc0Var = this.f24970b;
                ic0 ic0Var = pc0Var.f29847f;
                if (pc0Var.f29845c0.d.webpageTop) {
                    ic0Var.w0(-ic0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ic0Var.w0(ic0Var.computeVerticalScrollRange() - (ic0Var.computeVerticalScrollExtent() + ic0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f24970b.g(true, false);
                return;
        }
    }
}
