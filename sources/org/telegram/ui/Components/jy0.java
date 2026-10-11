package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class jy0 implements Runnable {
    public final int f27877a;
    public final yy0 f27878b;

    public jy0(yy0 yy0Var, int i10) {
        this.f27877a = i10;
        this.f27878b = yy0Var;
    }

    @Override
    public final void run() {
        switch (this.f27877a) {
            case 0:
                this.f27878b.d.l();
                return;
            case 1:
                this.f27878b.d.l();
                return;
            case 2:
                yy0.v(this.f27878b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f27878b.L, 1);
                return;
            default:
                yy0.u(this.f27878b);
                return;
        }
    }
}
