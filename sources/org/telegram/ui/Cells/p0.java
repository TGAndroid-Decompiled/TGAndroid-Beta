package org.telegram.ui.Cells;

import org.telegram.ui.Components.oh0;
public final class p0 implements Runnable {
    public final int f31223a;
    public final oh0 f31224b;

    public p0(oh0 oh0Var, int i7) {
        this.f31223a = i7;
        this.f31224b = oh0Var;
    }

    @Override
    public final void run() {
        switch (this.f31223a) {
            case 0:
                this.f31224b.H(false);
                return;
            default:
                this.f31224b.start();
                return;
        }
    }
}
