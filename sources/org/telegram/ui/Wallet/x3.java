package org.telegram.ui.Wallet;

import android.view.View;
public final class x3 implements Runnable {
    public final int f43392a;
    public final b4 f43393b;

    public x3(b4 b4Var, int i3) {
        this.f43392a = i3;
        this.f43393b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f43392a) {
            case 0:
                org.telegram.ui.Cells.t0 t0Var = this.f43393b.f42232a;
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f43393b.p();
                return;
        }
    }
}
