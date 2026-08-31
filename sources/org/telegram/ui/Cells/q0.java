package org.telegram.ui.Cells;

import org.telegram.ui.Components.ij0;
public final class q0 implements Runnable {
    public final int f23349a;
    public final ij0 f23350b;

    public q0(ij0 ij0Var, int i10) {
        this.f23349a = i10;
        this.f23350b = ij0Var;
    }

    @Override
    public final void run() {
        switch (this.f23349a) {
            case 0:
                this.f23350b.F(false);
                return;
            default:
                this.f23350b.start();
                return;
        }
    }
}
