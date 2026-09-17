package org.telegram.ui.Cells;

import org.telegram.ui.Components.yi0;
public final class q0 implements Runnable {
    public final int f20608a;
    public final yi0 f20609b;

    public q0(yi0 yi0Var, int i10) {
        this.f20608a = i10;
        this.f20609b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f20608a) {
            case 0:
                this.f20609b.H(false);
                return;
            default:
                this.f20609b.start();
                return;
        }
    }
}
