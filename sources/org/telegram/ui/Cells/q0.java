package org.telegram.ui.Cells;

import org.telegram.ui.Components.xj0;
public final class q0 implements Runnable {
    public final int f22914a;
    public final xj0 f22915b;

    public q0(xj0 xj0Var, int i10) {
        this.f22914a = i10;
        this.f22915b = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22914a) {
            case 0:
                this.f22915b.H(false);
                return;
            default:
                this.f22915b.start();
                return;
        }
    }
}
