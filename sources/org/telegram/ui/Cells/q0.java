package org.telegram.ui.Cells;

import org.telegram.ui.Components.ij0;
public final class q0 implements Runnable {
    public final int f20795a;
    public final ij0 f20796b;

    public q0(ij0 ij0Var, int i10) {
        this.f20795a = i10;
        this.f20796b = ij0Var;
    }

    @Override
    public final void run() {
        switch (this.f20795a) {
            case 0:
                this.f20796b.H(false);
                return;
            default:
                this.f20796b.start();
                return;
        }
    }
}
