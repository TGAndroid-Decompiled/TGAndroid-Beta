package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;
public final class q0 implements Runnable {
    public final int f20832a;
    public final kj0 f20833b;

    public q0(kj0 kj0Var, int i10) {
        this.f20832a = i10;
        this.f20833b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f20832a) {
            case 0:
                this.f20833b.H(false);
                return;
            default:
                this.f20833b.start();
                return;
        }
    }
}
