package org.telegram.ui.Cells;

import org.telegram.ui.Components.gj0;
public final class q0 implements Runnable {
    public final int f21529a;
    public final gj0 f21530b;

    public q0(gj0 gj0Var, int i10) {
        this.f21529a = i10;
        this.f21530b = gj0Var;
    }

    @Override
    public final void run() {
        switch (this.f21529a) {
            case 0:
                this.f21530b.F(false);
                return;
            default:
                this.f21530b.start();
                return;
        }
    }
}
