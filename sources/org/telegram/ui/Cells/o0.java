package org.telegram.ui.Cells;

import org.telegram.ui.Components.zg0;
public final class o0 implements Runnable {
    public final int f29629a;
    public final zg0 f29630b;

    public o0(zg0 zg0Var, int i7) {
        this.f29629a = i7;
        this.f29630b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29629a) {
            case 0:
                this.f29630b.H(false);
                return;
            default:
                this.f29630b.start();
                return;
        }
    }
}
