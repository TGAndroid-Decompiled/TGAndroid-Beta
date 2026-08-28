package org.telegram.ui.Cells;

import org.telegram.ui.Components.mi0;
public final class q0 implements Runnable {
    public final int f24889a;
    public final mi0 f24890b;

    public q0(mi0 mi0Var, int i9) {
        this.f24889a = i9;
        this.f24890b = mi0Var;
    }

    @Override
    public final void run() {
        switch (this.f24889a) {
            case 0:
                this.f24890b.F(false);
                return;
            default:
                this.f24890b.start();
                return;
        }
    }
}
