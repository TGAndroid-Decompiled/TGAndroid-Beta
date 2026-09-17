package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class hx0 implements Runnable {
    public final int f24744a;
    public final wx0 f24745b;

    public hx0(wx0 wx0Var, int i10) {
        this.f24744a = i10;
        this.f24745b = wx0Var;
    }

    @Override
    public final void run() {
        switch (this.f24744a) {
            case 0:
                this.f24745b.d.l();
                return;
            case 1:
                this.f24745b.d.l();
                return;
            case 2:
                wx0.t(this.f24745b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24745b.L, 1);
                return;
            default:
                wx0.s(this.f24745b);
                return;
        }
    }
}
