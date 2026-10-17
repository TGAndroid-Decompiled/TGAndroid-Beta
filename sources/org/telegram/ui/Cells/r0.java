package org.telegram.ui.Cells;

import org.telegram.ui.Components.uj0;
public final class r0 implements Runnable {
    public final int f22799a;
    public final uj0 f22800b;

    public r0(uj0 uj0Var, int i10) {
        this.f22799a = i10;
        this.f22800b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22799a) {
            case 0:
                this.f22800b.H(false);
                return;
            default:
                this.f22800b.start();
                return;
        }
    }
}
