package org.telegram.ui.Cells;

import org.telegram.ui.Components.ek0;
public final class r0 implements Runnable {
    public final int f22693a;
    public final ek0 f22694b;

    public r0(ek0 ek0Var, int i10) {
        this.f22693a = i10;
        this.f22694b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f22693a) {
            case 0:
                this.f22694b.H(false);
                return;
            default:
                this.f22694b.start();
                return;
        }
    }
}
