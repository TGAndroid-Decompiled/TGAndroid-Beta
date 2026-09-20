package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class rx0 implements Runnable {
    public final int f27970a;
    public final gy0 f27971b;

    public rx0(gy0 gy0Var, int i10) {
        this.f27970a = i10;
        this.f27971b = gy0Var;
    }

    @Override
    public final void run() {
        switch (this.f27970a) {
            case 0:
                this.f27971b.d.l();
                return;
            case 1:
                this.f27971b.d.l();
                return;
            case 2:
                gy0.t(this.f27971b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f27971b.L, 1);
                return;
            default:
                gy0.s(this.f27971b);
                return;
        }
    }
}
