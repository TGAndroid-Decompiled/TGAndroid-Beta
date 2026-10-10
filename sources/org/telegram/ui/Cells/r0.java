package org.telegram.ui.Cells;

import org.telegram.ui.Components.dk0;
public final class r0 implements Runnable {
    public final int f22705a;
    public final dk0 f22706b;

    public r0(dk0 dk0Var, int i10) {
        this.f22705a = i10;
        this.f22706b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f22705a) {
            case 0:
                this.f22706b.H(false);
                return;
            default:
                this.f22706b.start();
                return;
        }
    }
}
