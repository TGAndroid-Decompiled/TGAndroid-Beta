package org.telegram.ui.Cells;

import org.telegram.ui.Components.ij0;
public final class q0 implements Runnable {
    public final int f20817a;
    public final ij0 f20818b;

    public q0(ij0 ij0Var, int i10) {
        this.f20817a = i10;
        this.f20818b = ij0Var;
    }

    @Override
    public final void run() {
        switch (this.f20817a) {
            case 0:
                this.f20818b.H(false);
                return;
            default:
                this.f20818b.start();
                return;
        }
    }
}
