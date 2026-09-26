package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class qx0 implements Runnable {
    public final int f27782a;
    public final fy0 f27783b;

    public qx0(fy0 fy0Var, int i10) {
        this.f27782a = i10;
        this.f27783b = fy0Var;
    }

    @Override
    public final void run() {
        switch (this.f27782a) {
            case 0:
                this.f27783b.d.l();
                return;
            case 1:
                this.f27783b.d.l();
                return;
            case 2:
                fy0.t(this.f27783b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f27783b.L, 1);
                return;
            default:
                fy0.s(this.f27783b);
                return;
        }
    }
}
