package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class fx0 implements Runnable {
    public final int f24104a;
    public final ux0 f24105b;

    public fx0(ux0 ux0Var, int i10) {
        this.f24104a = i10;
        this.f24105b = ux0Var;
    }

    @Override
    public final void run() {
        switch (this.f24104a) {
            case 0:
                this.f24105b.d.l();
                return;
            case 1:
                this.f24105b.d.l();
                return;
            case 2:
                ux0.t(this.f24105b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24105b.L, 1);
                return;
            default:
                ux0.s(this.f24105b);
                return;
        }
    }
}
