package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class zx0 implements Runnable {
    public final int f33043a;
    public final oy0 f33044b;

    public zx0(oy0 oy0Var, int i10) {
        this.f33043a = i10;
        this.f33044b = oy0Var;
    }

    @Override
    public final void run() {
        switch (this.f33043a) {
            case 0:
                this.f33044b.d.l();
                return;
            case 1:
                this.f33044b.d.l();
                return;
            case 2:
                oy0.v(this.f33044b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f33044b.L, 1);
                return;
            default:
                oy0.t(this.f33044b);
                return;
        }
    }
}
