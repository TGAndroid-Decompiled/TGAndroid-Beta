package org.telegram.ui.Cells;

import org.telegram.ui.Components.fk0;
public final class r0 implements Runnable {
    public final int f22465a;
    public final fk0 f22466b;

    public r0(fk0 fk0Var, int i10) {
        this.f22465a = i10;
        this.f22466b = fk0Var;
    }

    @Override
    public final void run() {
        switch (this.f22465a) {
            case 0:
                this.f22466b.H(false);
                return;
            default:
                this.f22466b.start();
                return;
        }
    }
}
