package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;
public final class q0 implements Runnable {
    public final int f25026a;
    public final xi0 f25027b;

    public q0(xi0 xi0Var, int i10) {
        this.f25026a = i10;
        this.f25027b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f25026a) {
            case 0:
                this.f25027b.F(false);
                return;
            default:
                this.f25027b.start();
                return;
        }
    }
}
