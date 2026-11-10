package org.telegram.ui.Cells;

import org.telegram.ui.Components.zg0;
public final class o0 implements Runnable {
    public final int f29647a;
    public final zg0 f29648b;

    public o0(zg0 zg0Var, int i7) {
        this.f29647a = i7;
        this.f29648b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29647a) {
            case 0:
                this.f29648b.H(false);
                return;
            default:
                this.f29648b.start();
                return;
        }
    }
}
