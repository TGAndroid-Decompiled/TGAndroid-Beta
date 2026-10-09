package org.telegram.ui.Cells;

import org.telegram.ui.Components.ck0;
public final class r0 implements Runnable {
    public final int f22701a;
    public final ck0 f22702b;

    public r0(ck0 ck0Var, int i10) {
        this.f22701a = i10;
        this.f22702b = ck0Var;
    }

    @Override
    public final void run() {
        switch (this.f22701a) {
            case 0:
                this.f22702b.H(false);
                return;
            default:
                this.f22702b.start();
                return;
        }
    }
}
