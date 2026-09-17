package org.telegram.ui.Components;
public final class ab0 implements Runnable {
    public final int f22364a;
    public final pb0 f22365b;

    public ab0(pb0 pb0Var, int i10) {
        this.f22364a = i10;
        this.f22365b = pb0Var;
    }

    @Override
    public final void run() {
        switch (this.f22364a) {
            case 0:
                pb0 pb0Var = this.f22365b;
                hb0 hb0Var = pb0Var.f26989f;
                if (pb0Var.f26988c0.d.webpageTop) {
                    hb0Var.x0(-hb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                hb0Var.x0(hb0Var.computeVerticalScrollRange() - (hb0Var.computeVerticalScrollExtent() + hb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f22365b.g(true, false);
                return;
        }
    }
}
