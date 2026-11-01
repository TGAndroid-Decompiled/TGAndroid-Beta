package org.telegram.ui.Components;
public final class la0 implements Runnable {
    public final int f28100a;
    public final ua0 f28101b;

    public la0(ua0 ua0Var, int i10) {
        this.f28100a = i10;
        this.f28101b = ua0Var;
    }

    @Override
    public final void run() {
        switch (this.f28100a) {
            case 0:
                ua0 ua0Var = this.f28101b;
                ag.b1 b1Var = ua0Var.f30916f;
                if (ua0Var.f30915c0.d.f17465r) {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), 250, ci.o.V);
                    return;
                }
                b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), 250, ci.o.V);
                return;
            default:
                this.f28101b.h(true, false);
                return;
        }
    }
}
