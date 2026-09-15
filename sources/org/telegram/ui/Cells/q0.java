package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;
public final class q0 implements Runnable {
    public final int f20598a;
    public final xi0 f20599b;

    public q0(xi0 xi0Var, int i10) {
        this.f20598a = i10;
        this.f20599b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f20598a) {
            case 0:
                this.f20599b.H(false);
                return;
            default:
                this.f20599b.start();
                return;
        }
    }
}
