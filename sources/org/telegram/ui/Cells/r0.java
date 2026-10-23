package org.telegram.ui.Cells;

import org.telegram.ui.Components.vj0;
public final class r0 implements Runnable {
    public final int f22804a;
    public final vj0 f22805b;

    public r0(vj0 vj0Var, int i10) {
        this.f22804a = i10;
        this.f22805b = vj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22804a) {
            case 0:
                this.f22805b.H(false);
                return;
            default:
                this.f22805b.start();
                return;
        }
    }
}
