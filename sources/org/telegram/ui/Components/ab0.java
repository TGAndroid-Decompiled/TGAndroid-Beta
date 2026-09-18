package org.telegram.ui.Components;
public final class ab0 implements Runnable {
    public final int f22367a;
    public final pb0 f22368b;

    public ab0(pb0 pb0Var, int i10) {
        this.f22367a = i10;
        this.f22368b = pb0Var;
    }

    @Override
    public final void run() {
        switch (this.f22367a) {
            case 0:
                pb0 pb0Var = this.f22368b;
                hb0 hb0Var = pb0Var.f26992f;
                if (pb0Var.f26991c0.d.webpageTop) {
                    hb0Var.x0(-hb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                hb0Var.x0(hb0Var.computeVerticalScrollRange() - (hb0Var.computeVerticalScrollExtent() + hb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f22368b.g(true, false);
                return;
        }
    }
}
