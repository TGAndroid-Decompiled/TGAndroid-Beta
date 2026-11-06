package org.telegram.ui.Wallet;

import android.view.View;
public final class z3 implements Runnable {
    public final int f43418a;
    public final d4 f43419b;

    public z3(d4 d4Var, int i7) {
        this.f43418a = i7;
        this.f43419b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f43418a) {
            case 0:
                org.telegram.ui.Cells.t0 t0Var = this.f43419b.f42338a;
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f43419b.p();
                return;
        }
    }
}
