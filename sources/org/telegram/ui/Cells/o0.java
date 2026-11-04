package org.telegram.ui.Cells;

import org.telegram.ui.Components.ch0;
public final class o0 implements Runnable {
    public final int f29723a;
    public final ch0 f29724b;

    public o0(ch0 ch0Var, int i3) {
        this.f29723a = i3;
        this.f29724b = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f29723a) {
            case 0:
                this.f29724b.H(false);
                return;
            default:
                this.f29724b.start();
                return;
        }
    }
}
