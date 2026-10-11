package org.telegram.ui.Cells;

import org.telegram.ui.Components.dk0;
public final class r0 implements Runnable {
    public final int f22729a;
    public final dk0 f22730b;

    public r0(dk0 dk0Var, int i10) {
        this.f22729a = i10;
        this.f22730b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f22729a) {
            case 0:
                this.f22730b.H(false);
                return;
            default:
                this.f22730b.start();
                return;
        }
    }
}
