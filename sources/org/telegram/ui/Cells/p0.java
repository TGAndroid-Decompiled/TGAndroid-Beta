package org.telegram.ui.Cells;

import org.telegram.ui.Components.mh0;
public final class p0 implements Runnable {
    public final int f31192a;
    public final mh0 f31193b;

    public p0(mh0 mh0Var, int i7) {
        this.f31192a = i7;
        this.f31193b = mh0Var;
    }

    @Override
    public final void run() {
        switch (this.f31192a) {
            case 0:
                this.f31193b.H(false);
                return;
            default:
                this.f31193b.start();
                return;
        }
    }
}
