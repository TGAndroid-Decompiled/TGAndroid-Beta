package org.telegram.ui.Cells;

import org.telegram.ui.Components.lj0;
public final class q0 implements Runnable {
    public final int f20850a;
    public final lj0 f20851b;

    public q0(lj0 lj0Var, int i10) {
        this.f20850a = i10;
        this.f20851b = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f20850a) {
            case 0:
                this.f20851b.H(false);
                return;
            default:
                this.f20851b.start();
                return;
        }
    }
}
