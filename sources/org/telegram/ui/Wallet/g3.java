package org.telegram.ui.Wallet;

import android.view.View;
public final class g3 implements Runnable {
    public final int f34224a;
    public final k3 f34225b;

    public g3(k3 k3Var, int i10) {
        this.f34224a = i10;
        this.f34225b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f34224a) {
            case 0:
                org.telegram.ui.Cells.x0 x0Var = this.f34225b.f34385a;
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34225b.s();
                return;
        }
    }
}
