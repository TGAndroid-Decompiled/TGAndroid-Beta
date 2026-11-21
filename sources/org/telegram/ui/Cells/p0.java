package org.telegram.ui.Cells;

import org.telegram.ui.Components.oh0;
public final class p0 implements Runnable {
    public final int f31220a;
    public final oh0 f31221b;

    public p0(oh0 oh0Var, int i7) {
        this.f31220a = i7;
        this.f31221b = oh0Var;
    }

    @Override
    public final void run() {
        switch (this.f31220a) {
            case 0:
                this.f31221b.H(false);
                return;
            default:
                this.f31221b.start();
                return;
        }
    }
}
