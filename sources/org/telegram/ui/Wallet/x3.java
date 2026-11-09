package org.telegram.ui.Wallet;

import android.view.View;
public final class x3 implements Runnable {
    public final int f43307a;
    public final b4 f43308b;

    public x3(b4 b4Var, int i7) {
        this.f43307a = i7;
        this.f43308b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f43307a) {
            case 0:
                org.telegram.ui.Cells.t0 t0Var = this.f43308b.f42222a;
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f43308b.p();
                return;
        }
    }
}
