package org.telegram.ui.Cells;

import org.telegram.ui.Components.mh0;
public final class p0 implements Runnable {
    public final int f31213a;
    public final mh0 f31214b;

    public p0(mh0 mh0Var, int i7) {
        this.f31213a = i7;
        this.f31214b = mh0Var;
    }

    @Override
    public final void run() {
        switch (this.f31213a) {
            case 0:
                this.f31214b.H(false);
                return;
            default:
                this.f31214b.start();
                return;
        }
    }
}
