package org.telegram.ui.Cells;

import org.telegram.ui.Components.hj0;
public final class q0 implements Runnable {
    public final int f19701a;
    public final hj0 f19702b;

    public q0(hj0 hj0Var, int i10) {
        this.f19701a = i10;
        this.f19702b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f19701a) {
            case 0:
                this.f19702b.H(false);
                return;
            default:
                this.f19702b.start();
                return;
        }
    }
}
