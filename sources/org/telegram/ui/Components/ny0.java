package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ny0 implements Runnable {
    public final int f31096a;
    public final dz0 f31097b;

    public ny0(dz0 dz0Var, int i10) {
        this.f31096a = i10;
        this.f31097b = dz0Var;
    }

    @Override
    public final void run() {
        switch (this.f31096a) {
            case 0:
                this.f31097b.d.l();
                return;
            case 1:
                this.f31097b.d.l();
                return;
            case 2:
                dz0.u(this.f31097b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f31097b.L, 1);
                return;
            default:
                dz0.t(this.f31097b);
                return;
        }
    }
}
