package org.telegram.ui.Cells;

import org.telegram.ui.Components.uj0;
public final class r0 implements Runnable {
    public final int f22796a;
    public final uj0 f22797b;

    public r0(uj0 uj0Var, int i10) {
        this.f22796a = i10;
        this.f22797b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22796a) {
            case 0:
                this.f22797b.H(false);
                return;
            default:
                this.f22797b.start();
                return;
        }
    }
}
