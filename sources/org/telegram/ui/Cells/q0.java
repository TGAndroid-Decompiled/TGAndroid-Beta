package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;
public final class q0 implements Runnable {
    public final int f20833a;
    public final kj0 f20834b;

    public q0(kj0 kj0Var, int i10) {
        this.f20833a = i10;
        this.f20834b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f20833a) {
            case 0:
                this.f20834b.H(false);
                return;
            default:
                this.f20834b.start();
                return;
        }
    }
}
