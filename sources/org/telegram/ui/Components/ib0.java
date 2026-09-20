package org.telegram.ui.Components;
public final class ib0 implements Runnable {
    public final int f24985a;
    public final xb0 f24986b;

    public ib0(xb0 xb0Var, int i10) {
        this.f24985a = i10;
        this.f24986b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f24985a) {
            case 0:
                xb0 xb0Var = this.f24986b;
                pb0 pb0Var = xb0Var.f30230f;
                if (xb0Var.f30229c0.d.webpageTop) {
                    pb0Var.x0(-pb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                pb0Var.x0(pb0Var.computeVerticalScrollRange() - (pb0Var.computeVerticalScrollExtent() + pb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f24986b.g(true, false);
                return;
        }
    }
}
