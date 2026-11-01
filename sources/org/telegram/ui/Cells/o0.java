package org.telegram.ui.Cells;

import org.telegram.ui.Components.ci0;
public final class o0 implements Runnable {
    public final int f22375a;
    public final ci0 f22376b;

    public o0(ci0 ci0Var, int i10) {
        this.f22375a = i10;
        this.f22376b = ci0Var;
    }

    @Override
    public final void run() {
        switch (this.f22375a) {
            case 0:
                this.f22376b.H(false);
                return;
            default:
                this.f22376b.start();
                return;
        }
    }
}
