package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;
public final class q0 implements Runnable {
    public final int f22681a;
    public final kj0 f22682b;

    public q0(kj0 kj0Var, int i10) {
        this.f22681a = i10;
        this.f22682b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22681a) {
            case 0:
                this.f22682b.H(false);
                return;
            default:
                this.f22682b.start();
                return;
        }
    }
}
