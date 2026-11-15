package org.telegram.ui.Wallet;

import android.view.View;
public final class y3 implements Runnable {
    public final int f44719a;
    public final c4 f44720b;

    public y3(c4 c4Var, int i7) {
        this.f44719a = i7;
        this.f44720b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f44719a) {
            case 0:
                org.telegram.ui.Cells.t0 t0Var = this.f44720b.f43571a;
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f44720b.p();
                return;
        }
    }
}
