package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;
public final class q0 implements Runnable {
    public final int f20592a;
    public final xi0 f20593b;

    public q0(xi0 xi0Var, int i10) {
        this.f20592a = i10;
        this.f20593b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f20592a) {
            case 0:
                this.f20593b.H(false);
                return;
            default:
                this.f20593b.start();
                return;
        }
    }
}
