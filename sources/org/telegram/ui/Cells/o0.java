package org.telegram.ui.Cells;

import org.telegram.ui.Components.zg0;
public final class o0 implements Runnable {
    public final int f29628a;
    public final zg0 f29629b;

    public o0(zg0 zg0Var, int i7) {
        this.f29628a = i7;
        this.f29629b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29628a) {
            case 0:
                this.f29629b.H(false);
                return;
            default:
                this.f29629b.start();
                return;
        }
    }
}
