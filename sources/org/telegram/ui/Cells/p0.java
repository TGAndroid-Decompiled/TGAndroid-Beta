package org.telegram.ui.Cells;

import org.telegram.ui.Components.oh0;
public final class p0 implements Runnable {
    public final int f31189a;
    public final oh0 f31190b;

    public p0(oh0 oh0Var, int i7) {
        this.f31189a = i7;
        this.f31190b = oh0Var;
    }

    @Override
    public final void run() {
        switch (this.f31189a) {
            case 0:
                this.f31190b.H(false);
                return;
            default:
                this.f31190b.start();
                return;
        }
    }
}
