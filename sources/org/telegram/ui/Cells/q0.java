package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;
public final class q0 implements Runnable {
    public final int f22506a;
    public final xi0 f22507b;

    public q0(xi0 xi0Var, int i10) {
        this.f22506a = i10;
        this.f22507b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f22506a) {
            case 0:
                this.f22507b.F(false);
                return;
            default:
                this.f22507b.start();
                return;
        }
    }
}
