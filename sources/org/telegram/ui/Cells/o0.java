package org.telegram.ui.Cells;

import org.telegram.ui.Components.bi0;
public final class o0 implements Runnable {
    public final int f22374a;
    public final bi0 f22375b;

    public o0(bi0 bi0Var, int i10) {
        this.f22374a = i10;
        this.f22375b = bi0Var;
    }

    @Override
    public final void run() {
        switch (this.f22374a) {
            case 0:
                this.f22375b.H(false);
                return;
            default:
                this.f22375b.start();
                return;
        }
    }
}
