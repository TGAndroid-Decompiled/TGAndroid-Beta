package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class gx0 implements Runnable {
    public final int f24464a;
    public final vx0 f24465b;

    public gx0(vx0 vx0Var, int i10) {
        this.f24464a = i10;
        this.f24465b = vx0Var;
    }

    @Override
    public final void run() {
        switch (this.f24464a) {
            case 0:
                this.f24465b.d.l();
                return;
            case 1:
                this.f24465b.d.l();
                return;
            case 2:
                vx0.t(this.f24465b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24465b.L, 1);
                return;
            default:
                vx0.s(this.f24465b);
                return;
        }
    }
}
