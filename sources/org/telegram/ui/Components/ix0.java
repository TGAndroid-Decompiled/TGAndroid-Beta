package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ix0 implements Runnable {
    public final int f25783a;
    public final xx0 f25784b;

    public ix0(xx0 xx0Var, int i10) {
        this.f25783a = i10;
        this.f25784b = xx0Var;
    }

    @Override
    public final void run() {
        switch (this.f25783a) {
            case 0:
                this.f25784b.d.l();
                return;
            case 1:
                this.f25784b.d.l();
                return;
            case 2:
                xx0.t(this.f25784b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25784b.I, 1);
                return;
            default:
                xx0.s(this.f25784b);
                return;
        }
    }
}
