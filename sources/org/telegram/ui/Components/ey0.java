package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ey0 implements Runnable {
    public final int f24820a;
    public final ty0 f24821b;

    public ey0(ty0 ty0Var, int i10) {
        this.f24820a = i10;
        this.f24821b = ty0Var;
    }

    @Override
    public final void run() {
        switch (this.f24820a) {
            case 0:
                this.f24821b.d.l();
                return;
            case 1:
                this.f24821b.d.l();
                return;
            case 2:
                ty0.v(this.f24821b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24821b.L, 1);
                return;
            default:
                ty0.u(this.f24821b);
                return;
        }
    }
}
