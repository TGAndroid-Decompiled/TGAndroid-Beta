package org.telegram.ui.Components;
public final class ab0 implements Runnable {
    public final int f22346a;
    public final pb0 f22347b;

    public ab0(pb0 pb0Var, int i10) {
        this.f22346a = i10;
        this.f22347b = pb0Var;
    }

    @Override
    public final void run() {
        switch (this.f22346a) {
            case 0:
                pb0 pb0Var = this.f22347b;
                hb0 hb0Var = pb0Var.f26999f;
                if (pb0Var.f26998c0.d.webpageTop) {
                    hb0Var.w0(-hb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                hb0Var.w0(hb0Var.computeVerticalScrollRange() - (hb0Var.computeVerticalScrollExtent() + hb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f22347b.g(true, false);
                return;
        }
    }
}
