package org.telegram.ui.Cells;

import org.telegram.ui.Components.xj0;
public final class q0 implements Runnable {
    public final int f24788a;
    public final xj0 f24789b;

    public q0(xj0 xj0Var, int i10) {
        this.f24788a = i10;
        this.f24789b = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f24788a) {
            case 0:
                this.f24789b.H(false);
                return;
            default:
                this.f24789b.start();
                return;
        }
    }
}
