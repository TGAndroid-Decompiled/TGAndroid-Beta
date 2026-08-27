package org.telegram.ui.Components;

public final class na0 implements Runnable {

    public final int f30911a;

    public final ab0 f30912b;

    public na0(ab0 ab0Var, int i10) {
        this.f30911a = i10;
        this.f30912b = ab0Var;
    }

    @Override
    public final void run() {
        switch (this.f30911a) {
            case 0:
                ab0 ab0Var = this.f30912b;
                ta0 ta0Var = ab0Var.f26716f;
                if (!ab0Var.V.d.webpageTop) {
                    ta0Var.w0(ta0Var.computeVerticalScrollRange() - (ta0Var.computeVerticalScrollExtent() + ta0Var.computeVerticalScrollOffset()), 250, sh.m.V);
                } else {
                    ta0Var.w0(-ta0Var.computeVerticalScrollOffset(), 250, sh.m.V);
                }
                break;
            default:
                this.f30912b.g(true, false);
                break;
        }
    }
}
