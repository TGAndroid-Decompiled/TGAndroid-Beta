package org.telegram.ui.Wallet;

import android.view.View;
public final class z3 implements Runnable {
    public final int f35452a;
    public final d4 f35453b;

    public z3(d4 d4Var, int i10) {
        this.f35452a = i10;
        this.f35453b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f35452a) {
            case 0:
                org.telegram.ui.Cells.s0 s0Var = this.f35453b.f34377a;
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f35453b.p();
                return;
        }
    }
}
