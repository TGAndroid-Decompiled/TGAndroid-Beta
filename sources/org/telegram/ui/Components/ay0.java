package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ay0 implements Runnable {
    public final int f24735a;
    public final py0 f24736b;

    public ay0(py0 py0Var, int i10) {
        this.f24735a = i10;
        this.f24736b = py0Var;
    }

    @Override
    public final void run() {
        switch (this.f24735a) {
            case 0:
                this.f24736b.d.l();
                return;
            case 1:
                this.f24736b.d.l();
                return;
            case 2:
                py0.v(this.f24736b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24736b.L, 1);
                return;
            default:
                py0.u(this.f24736b);
                return;
        }
    }
}
