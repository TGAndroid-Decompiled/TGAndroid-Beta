package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class oy0 implements Runnable {
    public final int f29322a;
    public final dz0 f29323b;

    public oy0(dz0 dz0Var, int i10) {
        this.f29322a = i10;
        this.f29323b = dz0Var;
    }

    @Override
    public final void run() {
        switch (this.f29322a) {
            case 0:
                this.f29323b.d.l();
                return;
            case 1:
                this.f29323b.d.l();
                return;
            case 2:
                dz0.v(this.f29323b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f29323b.L, 1);
                return;
            default:
                dz0.u(this.f29323b);
                return;
        }
    }
}
