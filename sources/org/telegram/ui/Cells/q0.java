package org.telegram.ui.Cells;

import org.telegram.ui.Components.jj0;
public final class q0 implements Runnable {
    public final int f20831a;
    public final jj0 f20832b;

    public q0(jj0 jj0Var, int i10) {
        this.f20831a = i10;
        this.f20832b = jj0Var;
    }

    @Override
    public final void run() {
        switch (this.f20831a) {
            case 0:
                this.f20832b.H(false);
                return;
            default:
                this.f20832b.start();
                return;
        }
    }
}
