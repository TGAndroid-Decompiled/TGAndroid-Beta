package org.telegram.ui.Components;
public final class fc0 implements Runnable {
    public final int f26010a;
    public final tc0 f26011b;

    public fc0(tc0 tc0Var, int i10) {
        this.f26010a = i10;
        this.f26011b = tc0Var;
    }

    @Override
    public final void run() {
        switch (this.f26010a) {
            case 0:
                tc0 tc0Var = this.f26011b;
                mc0 mc0Var = tc0Var.f30861f;
                if (tc0Var.f30859c0.d.webpageTop) {
                    mc0Var.w0(-mc0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                mc0Var.w0(mc0Var.computeVerticalScrollRange() - (mc0Var.computeVerticalScrollExtent() + mc0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26011b.g(true, false);
                return;
        }
    }
}
