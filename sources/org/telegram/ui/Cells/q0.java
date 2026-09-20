package org.telegram.ui.Cells;

import org.telegram.ui.Components.hj0;
public final class q0 implements Runnable {
    public final int f20830a;
    public final hj0 f20831b;

    public q0(hj0 hj0Var, int i10) {
        this.f20830a = i10;
        this.f20831b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f20830a) {
            case 0:
                this.f20831b.H(false);
                return;
            default:
                this.f20831b.start();
                return;
        }
    }
}
