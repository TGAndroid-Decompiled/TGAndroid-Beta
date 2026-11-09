package org.telegram.ui.Cells;

import org.telegram.ui.Components.ah0;
public final class o0 implements Runnable {
    public final int f29636a;
    public final ah0 f29637b;

    public o0(ah0 ah0Var, int i7) {
        this.f29636a = i7;
        this.f29637b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f29636a) {
            case 0:
                this.f29637b.H(false);
                return;
            default:
                this.f29637b.start();
                return;
        }
    }
}
