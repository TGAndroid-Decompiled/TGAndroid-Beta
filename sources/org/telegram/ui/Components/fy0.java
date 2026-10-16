package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class fy0 implements Runnable {
    public final int f24832a;
    public final uy0 f24833b;

    public fy0(uy0 uy0Var, int i10) {
        this.f24832a = i10;
        this.f24833b = uy0Var;
    }

    @Override
    public final void run() {
        switch (this.f24832a) {
            case 0:
                this.f24833b.d.l();
                return;
            case 1:
                this.f24833b.d.l();
                return;
            case 2:
                uy0.v(this.f24833b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24833b.L, 1);
                return;
            default:
                uy0.u(this.f24833b);
                return;
        }
    }
}
