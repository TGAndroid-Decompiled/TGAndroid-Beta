package org.telegram.ui.Wallet;

import android.view.View;
public final class i4 implements Runnable {
    public final int f44364a;
    public final m4 f44365b;

    public i4(m4 m4Var, int i7) {
        this.f44364a = i7;
        this.f44365b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f44364a) {
            case 0:
                org.telegram.ui.Cells.v0 v0Var = this.f44365b.f44525a;
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f44365b.p();
                return;
        }
    }
}
