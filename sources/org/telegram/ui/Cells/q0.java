package org.telegram.ui.Cells;

import org.telegram.ui.Components.oi0;

public final class q0 implements Runnable {

    public final int f25015a;

    public final oi0 f25016b;

    public q0(oi0 oi0Var, int i10) {
        this.f25015a = i10;
        this.f25016b = oi0Var;
    }

    @Override
    public final void run() {
        switch (this.f25015a) {
            case 0:
                this.f25016b.F(false);
                break;
            default:
                this.f25016b.start();
                break;
        }
    }
}
