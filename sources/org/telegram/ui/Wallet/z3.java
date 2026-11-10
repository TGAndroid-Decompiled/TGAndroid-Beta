package org.telegram.ui.Wallet;

import android.view.View;
public final class z3 implements Runnable {
    public final int f43437a;
    public final d4 f43438b;

    public z3(d4 d4Var, int i7) {
        this.f43437a = i7;
        this.f43438b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f43437a) {
            case 0:
                org.telegram.ui.Cells.t0 t0Var = this.f43438b.f42302a;
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f43438b.p();
                return;
        }
    }
}
