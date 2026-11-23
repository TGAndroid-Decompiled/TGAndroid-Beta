package org.telegram.ui.Cells;

import org.telegram.ui.Components.nh0;
public final class p0 implements Runnable {
    public final int f31300a;
    public final nh0 f31301b;

    public p0(nh0 nh0Var, int i7) {
        this.f31300a = i7;
        this.f31301b = nh0Var;
    }

    @Override
    public final void run() {
        switch (this.f31300a) {
            case 0:
                this.f31301b.H(false);
                return;
            default:
                this.f31301b.start();
                return;
        }
    }
}
