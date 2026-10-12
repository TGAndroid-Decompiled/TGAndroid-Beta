package org.telegram.ui.Cells;

import org.telegram.ui.Components.fk0;
public final class r0 implements Runnable {
    public final int f22464a;
    public final fk0 f22465b;

    public r0(fk0 fk0Var, int i10) {
        this.f22464a = i10;
        this.f22465b = fk0Var;
    }

    @Override
    public final void run() {
        switch (this.f22464a) {
            case 0:
                this.f22465b.H(false);
                return;
            default:
                this.f22465b.start();
                return;
        }
    }
}
