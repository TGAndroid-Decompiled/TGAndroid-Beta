package org.telegram.ui.Cells;

import org.telegram.ui.Components.zg0;
public final class o0 implements Runnable {
    public final int f29632a;
    public final zg0 f29633b;

    public o0(zg0 zg0Var, int i7) {
        this.f29632a = i7;
        this.f29633b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29632a) {
            case 0:
                this.f29633b.H(false);
                return;
            default:
                this.f29633b.start();
                return;
        }
    }
}
