package org.telegram.ui.Cells;

import org.telegram.ui.Components.vj0;
public final class r0 implements Runnable {
    public final int f22803a;
    public final vj0 f22804b;

    public r0(vj0 vj0Var, int i10) {
        this.f22803a = i10;
        this.f22804b = vj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22803a) {
            case 0:
                this.f22804b.H(false);
                return;
            default:
                this.f22804b.start();
                return;
        }
    }
}
