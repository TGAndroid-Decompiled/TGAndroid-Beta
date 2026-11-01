package org.telegram.ui.Wallet;

import android.view.View;
public final class z3 implements Runnable {
    public final int f35459a;
    public final d4 f35460b;

    public z3(d4 d4Var, int i10) {
        this.f35459a = i10;
        this.f35460b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f35459a) {
            case 0:
                org.telegram.ui.Cells.s0 s0Var = this.f35460b.f34382a;
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f35460b.p();
                return;
        }
    }
}
