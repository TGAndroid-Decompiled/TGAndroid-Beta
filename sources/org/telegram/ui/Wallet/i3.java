package org.telegram.ui.Wallet;

import android.view.View;
public final class i3 implements Runnable {
    public final int f34599a;
    public final m3 f34600b;

    public i3(m3 m3Var, int i10) {
        this.f34599a = i10;
        this.f34600b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f34599a) {
            case 0:
                org.telegram.ui.Cells.v0 v0Var = this.f34600b.f34806a;
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34600b.p();
                return;
        }
    }
}
