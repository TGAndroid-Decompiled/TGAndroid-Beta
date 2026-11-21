package org.telegram.ui.Wallet;

import android.view.View;
public final class i4 implements Runnable {
    public final int f44394a;
    public final m4 f44395b;

    public i4(m4 m4Var, int i7) {
        this.f44394a = i7;
        this.f44395b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f44394a) {
            case 0:
                org.telegram.ui.Cells.v0 v0Var = this.f44395b.f44555a;
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f44395b.p();
                return;
        }
    }
}
