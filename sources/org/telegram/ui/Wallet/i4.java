package org.telegram.ui.Wallet;

import android.view.View;
public final class i4 implements Runnable {
    public final int f44354a;
    public final m4 f44355b;

    public i4(m4 m4Var, int i7) {
        this.f44354a = i7;
        this.f44355b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f44354a) {
            case 0:
                org.telegram.ui.Cells.u0 u0Var = this.f44355b.f44515a;
                if (u0Var.getParent() instanceof View) {
                    ((View) u0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f44355b.p();
                return;
        }
    }
}
