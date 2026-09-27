package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class sx0 implements Runnable {
    public final int f28401a;
    public final hy0 f28402b;

    public sx0(hy0 hy0Var, int i10) {
        this.f28401a = i10;
        this.f28402b = hy0Var;
    }

    @Override
    public final void run() {
        switch (this.f28401a) {
            case 0:
                this.f28402b.d.l();
                return;
            case 1:
                this.f28402b.d.l();
                return;
            case 2:
                hy0.t(this.f28402b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f28402b.L, 1);
                return;
            default:
                hy0.s(this.f28402b);
                return;
        }
    }
}
