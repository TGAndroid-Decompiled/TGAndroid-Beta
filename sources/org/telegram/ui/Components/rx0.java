package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class rx0 implements Runnable {
    public final int f26776a;
    public final hy0 f26777b;

    public rx0(hy0 hy0Var, int i10) {
        this.f26776a = i10;
        this.f26777b = hy0Var;
    }

    @Override
    public final void run() {
        switch (this.f26776a) {
            case 0:
                this.f26777b.d.l();
                return;
            case 1:
                this.f26777b.d.l();
                return;
            case 2:
                hy0.t(this.f26777b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f26777b.L, 1);
                return;
            default:
                hy0.s(this.f26777b);
                return;
        }
    }
}
