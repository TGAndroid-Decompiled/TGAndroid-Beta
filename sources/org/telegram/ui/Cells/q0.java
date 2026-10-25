package org.telegram.ui.Cells;

import org.telegram.ui.Components.xj0;
public final class q0 implements Runnable {
    public final int f24786a;
    public final xj0 f24787b;

    public q0(xj0 xj0Var, int i10) {
        this.f24786a = i10;
        this.f24787b = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f24786a) {
            case 0:
                this.f24787b.H(false);
                return;
            default:
                this.f24787b.start();
                return;
        }
    }
}
