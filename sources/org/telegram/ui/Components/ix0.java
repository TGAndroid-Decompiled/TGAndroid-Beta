package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ix0 implements Runnable {
    public final int f27907a;
    public final xx0 f27908b;

    public ix0(xx0 xx0Var, int i10) {
        this.f27907a = i10;
        this.f27908b = xx0Var;
    }

    @Override
    public final void run() {
        switch (this.f27907a) {
            case 0:
                this.f27908b.d.l();
                return;
            case 1:
                this.f27908b.d.l();
                return;
            case 2:
                xx0.t(this.f27908b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f27908b.I, 1);
                return;
            default:
                xx0.s(this.f27908b);
                return;
        }
    }
}
