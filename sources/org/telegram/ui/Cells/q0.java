package org.telegram.ui.Cells;

import org.telegram.ui.Components.yi0;
public final class q0 implements Runnable {
    public final int f20609a;
    public final yi0 f20610b;

    public q0(yi0 yi0Var, int i10) {
        this.f20609a = i10;
        this.f20610b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f20609a) {
            case 0:
                this.f20610b.H(false);
                return;
            default:
                this.f20610b.start();
                return;
        }
    }
}
