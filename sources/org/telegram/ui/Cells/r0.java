package org.telegram.ui.Cells;

import org.telegram.ui.Components.yj0;
public final class r0 implements Runnable {
    public final int f21441a;
    public final yj0 f21442b;

    public r0(yj0 yj0Var, int i10) {
        this.f21441a = i10;
        this.f21442b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f21441a) {
            case 0:
                this.f21442b.H(false);
                return;
            default:
                this.f21442b.start();
                return;
        }
    }
}
