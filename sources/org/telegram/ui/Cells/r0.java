package org.telegram.ui.Cells;

import org.telegram.ui.Components.vj0;
public final class r0 implements Runnable {
    public final int f22800a;
    public final vj0 f22801b;

    public r0(vj0 vj0Var, int i10) {
        this.f22800a = i10;
        this.f22801b = vj0Var;
    }

    @Override
    public final void run() {
        switch (this.f22800a) {
            case 0:
                this.f22801b.H(false);
                return;
            default:
                this.f22801b.start();
                return;
        }
    }
}
