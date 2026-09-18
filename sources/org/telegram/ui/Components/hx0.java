package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class hx0 implements Runnable {
    public final int f24747a;
    public final wx0 f24748b;

    public hx0(wx0 wx0Var, int i10) {
        this.f24747a = i10;
        this.f24748b = wx0Var;
    }

    @Override
    public final void run() {
        switch (this.f24747a) {
            case 0:
                this.f24748b.d.l();
                return;
            case 1:
                this.f24748b.d.l();
                return;
            case 2:
                wx0.t(this.f24748b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24748b.L, 1);
                return;
            default:
                wx0.s(this.f24748b);
                return;
        }
    }
}
