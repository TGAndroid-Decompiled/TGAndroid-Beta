package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;
public final class q0 implements Runnable {
    public final int f22478a;
    public final xi0 f22479b;

    public q0(xi0 xi0Var, int i10) {
        this.f22478a = i10;
        this.f22479b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f22478a) {
            case 0:
                this.f22479b.F(false);
                return;
            default:
                this.f22479b.start();
                return;
        }
    }
}
