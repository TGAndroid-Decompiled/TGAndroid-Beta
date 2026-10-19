package org.telegram.ui.Cells;

import org.telegram.ui.Components.uj0;
public final class r0 implements Runnable {
    public final int f22797a;
    public final uj0 f22798b;

    public r0(uj0 uj0Var, int i10) {
        this.f22797a = i10;
        this.f22798b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22797a) {
            case 0:
                this.f22798b.H(false);
                return;
            default:
                this.f22798b.start();
                return;
        }
    }
}
