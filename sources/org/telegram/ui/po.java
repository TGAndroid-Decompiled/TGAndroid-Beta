package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f36581a;
    public final long f36582b;
    public final long f36583c;
    public final org.telegram.ui.ActionBar.n2 d;

    public po(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f36581a = i10;
        this.d = n2Var;
        this.f36582b = j3;
        this.f36583c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.l61 l61Var;
        switch (this.f36581a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36582b, this.f36583c, new b5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.f36582b;
                a2Var.f38825n = this.f36583c;
                org.telegram.ui.Components.n61 n61Var = a2Var.f26891a;
                if (n61Var != null && (l61Var = n61Var.Y2) != null && n61Var.G) {
                    l61Var.N(true);
                    return;
                }
                return;
        }
    }
}
