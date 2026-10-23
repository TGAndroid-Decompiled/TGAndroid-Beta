package org.telegram.ui.Cells;

import org.telegram.ui.Components.yj0;
public final class q0 implements Runnable {
    public final int f22913a;
    public final yj0 f22914b;

    public q0(yj0 yj0Var, int i10) {
        this.f22913a = i10;
        this.f22914b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22913a) {
            case 0:
                this.f22914b.H(false);
                return;
            default:
                this.f22914b.start();
                return;
        }
    }
}
