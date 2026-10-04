package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;
public final class q0 implements Runnable {
    public final int f22674a;
    public final kj0 f22675b;

    public q0(kj0 kj0Var, int i10) {
        this.f22674a = i10;
        this.f22675b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22674a) {
            case 0:
                this.f22675b.H(false);
                return;
            default:
                this.f22675b.start();
                return;
        }
    }
}
