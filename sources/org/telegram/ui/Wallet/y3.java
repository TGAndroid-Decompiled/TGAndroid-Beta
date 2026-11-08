package org.telegram.ui.Wallet;

import android.view.View;
public final class y3 implements Runnable {
    public final int f43389a;
    public final c4 f43390b;

    public y3(c4 c4Var, int i7) {
        this.f43389a = i7;
        this.f43390b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f43389a) {
            case 0:
                org.telegram.ui.Cells.t0 t0Var = this.f43390b.f42308a;
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f43390b.p();
                return;
        }
    }
}
