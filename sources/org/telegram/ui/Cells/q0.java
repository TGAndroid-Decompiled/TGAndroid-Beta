package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;
public final class q0 implements Runnable {
    public final int f20845a;
    public final kj0 f20846b;

    public q0(kj0 kj0Var, int i10) {
        this.f20845a = i10;
        this.f20846b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f20845a) {
            case 0:
                this.f20846b.H(false);
                return;
            default:
                this.f20846b.start();
                return;
        }
    }
}
