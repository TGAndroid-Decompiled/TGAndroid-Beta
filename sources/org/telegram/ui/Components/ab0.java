package org.telegram.ui.Components;
public final class ab0 implements Runnable {
    public final int f22349a;
    public final pb0 f22350b;

    public ab0(pb0 pb0Var, int i10) {
        this.f22349a = i10;
        this.f22350b = pb0Var;
    }

    @Override
    public final void run() {
        switch (this.f22349a) {
            case 0:
                pb0 pb0Var = this.f22350b;
                hb0 hb0Var = pb0Var.f27002f;
                if (pb0Var.f27001c0.d.webpageTop) {
                    hb0Var.w0(-hb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                hb0Var.w0(hb0Var.computeVerticalScrollRange() - (hb0Var.computeVerticalScrollExtent() + hb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f22350b.g(true, false);
                return;
        }
    }
}
