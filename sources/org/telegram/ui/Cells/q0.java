package org.telegram.ui.Cells;

import org.telegram.ui.Components.gj0;
public final class q0 implements Runnable {
    public final int f21562a;
    public final gj0 f21563b;

    public q0(gj0 gj0Var, int i10) {
        this.f21562a = i10;
        this.f21563b = gj0Var;
    }

    @Override
    public final void run() {
        switch (this.f21562a) {
            case 0:
                this.f21563b.F(false);
                return;
            default:
                this.f21563b.start();
                return;
        }
    }
}
