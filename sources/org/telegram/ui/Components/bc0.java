package org.telegram.ui.Components;
public final class bc0 implements Runnable {
    public final int f24973a;
    public final pc0 f24974b;

    public bc0(pc0 pc0Var, int i10) {
        this.f24973a = i10;
        this.f24974b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f24973a) {
            case 0:
                pc0 pc0Var = this.f24974b;
                ic0 ic0Var = pc0Var.f29850f;
                if (pc0Var.f29848c0.d.webpageTop) {
                    ic0Var.w0(-ic0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                ic0Var.w0(ic0Var.computeVerticalScrollRange() - (ic0Var.computeVerticalScrollExtent() + ic0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f24974b.g(true, false);
                return;
        }
    }
}
