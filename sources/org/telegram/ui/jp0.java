package org.telegram.ui;
public final class jp0 implements Runnable {
    public final int f39129a;
    public final tp0 f39130b;

    public jp0(tp0 tp0Var, int i10) {
        this.f39129a = i10;
        this.f39130b = tp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39129a;
        tp0 tp0Var = this.f39130b;
        switch (i10) {
            case 0:
                if (tp0Var.G) {
                    tp0Var.f42257b.invalidate();
                    return;
                }
                return;
            case 1:
                tp0Var.h();
                return;
            case 2:
                int i11 = tp0.f42254q0;
                tp0Var.h();
                return;
            default:
                int i12 = tp0.f42254q0;
                tp0Var.h();
                return;
        }
    }
}
