package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class qx0 implements Runnable {
    public final int f27774a;
    public final fy0 f27775b;

    public qx0(fy0 fy0Var, int i10) {
        this.f27774a = i10;
        this.f27775b = fy0Var;
    }

    @Override
    public final void run() {
        switch (this.f27774a) {
            case 0:
                this.f27775b.d.l();
                return;
            case 1:
                this.f27775b.d.l();
                return;
            case 2:
                fy0.t(this.f27775b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f27775b.L, 1);
                return;
            default:
                fy0.s(this.f27775b);
                return;
        }
    }
}
