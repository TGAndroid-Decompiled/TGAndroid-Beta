package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class fx0 implements Runnable {
    public final int f26193a;
    public final ux0 f26194b;

    public fx0(ux0 ux0Var, int i10) {
        this.f26193a = i10;
        this.f26194b = ux0Var;
    }

    @Override
    public final void run() {
        switch (this.f26193a) {
            case 0:
                this.f26194b.d.l();
                return;
            case 1:
                this.f26194b.d.l();
                return;
            case 2:
                ux0.t(this.f26194b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f26194b.L, 1);
                return;
            default:
                ux0.s(this.f26194b);
                return;
        }
    }
}
