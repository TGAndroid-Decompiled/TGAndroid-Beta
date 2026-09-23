package org.telegram.ui.Cells;

import org.telegram.ui.Components.yi0;
public final class q0 implements Runnable {
    public final int f20583a;
    public final yi0 f20584b;

    public q0(yi0 yi0Var, int i10) {
        this.f20583a = i10;
        this.f20584b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f20583a) {
            case 0:
                this.f20584b.H(false);
                return;
            default:
                this.f20584b.start();
                return;
        }
    }
}
