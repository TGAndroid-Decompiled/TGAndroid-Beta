package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class iy0 implements Runnable {
    public final int f27515a;
    public final xy0 f27516b;

    public iy0(xy0 xy0Var, int i10) {
        this.f27515a = i10;
        this.f27516b = xy0Var;
    }

    @Override
    public final void run() {
        switch (this.f27515a) {
            case 0:
                this.f27516b.d.l();
                return;
            case 1:
                this.f27516b.d.l();
                return;
            case 2:
                xy0.v(this.f27516b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f27516b.L, 1);
                return;
            default:
                xy0.u(this.f27516b);
                return;
        }
    }
}
