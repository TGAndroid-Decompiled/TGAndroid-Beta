package org.telegram.ui.Wallet;

import android.view.View;
public final class z2 implements Runnable {
    public final int f35736a;
    public final d3 f35737b;

    public z2(d3 d3Var, int i10) {
        this.f35736a = i10;
        this.f35737b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f35736a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f35737b.f34773a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f35737b.p();
                return;
        }
    }
}
