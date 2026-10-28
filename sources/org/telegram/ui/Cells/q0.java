package org.telegram.ui.Cells;

import org.telegram.ui.Components.yj0;
public final class q0 implements Runnable {
    public final int f24790a;
    public final yj0 f24791b;

    public q0(yj0 yj0Var, int i10) {
        this.f24790a = i10;
        this.f24791b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f24790a) {
            case 0:
                this.f24791b.H(false);
                return;
            default:
                this.f24791b.start();
                return;
        }
    }
}
