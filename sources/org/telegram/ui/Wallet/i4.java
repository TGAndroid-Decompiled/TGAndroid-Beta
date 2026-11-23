package org.telegram.ui.Wallet;

import android.view.View;
public final class i4 implements Runnable {
    public final int f44398a;
    public final m4 f44399b;

    public i4(m4 m4Var, int i7) {
        this.f44398a = i7;
        this.f44399b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f44398a) {
            case 0:
                org.telegram.ui.Cells.v0 v0Var = this.f44399b.f44559a;
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f44399b.p();
                return;
        }
    }
}
