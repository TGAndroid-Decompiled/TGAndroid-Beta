package org.telegram.ui.Wallet;

import android.view.View;
public final class z2 implements Runnable {
    public final int f33915a;
    public final d3 f33916b;

    public z2(d3 d3Var, int i10) {
        this.f33915a = i10;
        this.f33916b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f33915a) {
            case 0:
                org.telegram.ui.Cells.x0 x0Var = this.f33916b.f33045a;
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f33916b.p();
                return;
        }
    }
}
