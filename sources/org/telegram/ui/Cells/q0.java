package org.telegram.ui.Cells;

import org.telegram.ui.Components.hj0;
public final class q0 implements Runnable {
    public final int f23351a;
    public final hj0 f23352b;

    public q0(hj0 hj0Var, int i10) {
        this.f23351a = i10;
        this.f23352b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f23351a) {
            case 0:
                this.f23352b.F(false);
                return;
            default:
                this.f23352b.start();
                return;
        }
    }
}
