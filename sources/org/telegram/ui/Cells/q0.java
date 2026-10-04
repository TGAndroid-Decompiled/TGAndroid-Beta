package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;
public final class q0 implements Runnable {
    public final int f22673a;
    public final kj0 f22674b;

    public q0(kj0 kj0Var, int i10) {
        this.f22673a = i10;
        this.f22674b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22673a) {
            case 0:
                this.f22674b.H(false);
                return;
            default:
                this.f22674b.start();
                return;
        }
    }
}
