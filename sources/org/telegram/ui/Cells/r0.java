package org.telegram.ui.Cells;

import org.telegram.ui.Components.uj0;
public final class r0 implements Runnable {
    public final int f22803a;
    public final uj0 f22804b;

    public r0(uj0 uj0Var, int i10) {
        this.f22803a = i10;
        this.f22804b = uj0Var;
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
