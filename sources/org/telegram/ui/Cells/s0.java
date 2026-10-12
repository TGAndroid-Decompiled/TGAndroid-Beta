package org.telegram.ui.Cells;

import org.telegram.ui.Components.yj0;
public final class s0 implements Runnable {
    public final int f21779a;
    public final yj0 f21780b;

    public s0(yj0 yj0Var, int i10) {
        this.f21779a = i10;
        this.f21780b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f21779a) {
            case 0:
                this.f21780b.H(false);
                return;
            default:
                this.f21780b.start();
                return;
        }
    }
}
