package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class rx0 implements Runnable {
    public final int f28078a;
    public final gy0 f28079b;

    public rx0(gy0 gy0Var, int i10) {
        this.f28078a = i10;
        this.f28079b = gy0Var;
    }

    @Override
    public final void run() {
        switch (this.f28078a) {
            case 0:
                this.f28079b.d.l();
                return;
            case 1:
                this.f28079b.d.l();
                return;
            case 2:
                gy0.t(this.f28079b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f28079b.L, 1);
                return;
            default:
                gy0.s(this.f28079b);
                return;
        }
    }
}
