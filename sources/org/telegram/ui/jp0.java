package org.telegram.ui;
public final class jp0 implements Runnable {
    public final int f39095a;
    public final tp0 f39096b;

    public jp0(tp0 tp0Var, int i10) {
        this.f39095a = i10;
        this.f39096b = tp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39095a;
        tp0 tp0Var = this.f39096b;
        switch (i10) {
            case 0:
                if (tp0Var.G) {
                    tp0Var.f42223b.invalidate();
                    return;
                }
                return;
            case 1:
                tp0Var.h();
                return;
            case 2:
                int i11 = tp0.f42220q0;
                tp0Var.h();
                return;
            default:
                int i12 = tp0.f42220q0;
                tp0Var.h();
                return;
        }
    }
}
