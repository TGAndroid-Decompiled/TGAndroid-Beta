package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;
public final class q0 implements Runnable {
    public final int f22678a;
    public final kj0 f22679b;

    public q0(kj0 kj0Var, int i10) {
        this.f22678a = i10;
        this.f22679b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22678a) {
            case 0:
                this.f22679b.H(false);
                return;
            default:
                this.f22679b.start();
                return;
        }
    }
}
