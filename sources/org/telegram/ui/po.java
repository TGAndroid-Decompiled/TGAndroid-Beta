package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f40855a;
    public final long f40856b;
    public final long f40857c;
    public final org.telegram.ui.ActionBar.n2 d;

    public po(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f40855a = i10;
        this.d = n2Var;
        this.f40856b = j3;
        this.f40857c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.c71 c71Var;
        switch (this.f40855a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40856b, this.f40857c, new b5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f43562f = this.f40856b;
                z1Var.h = this.f40857c;
                org.telegram.ui.Components.e71 e71Var = z1Var.f26290a;
                if (e71Var != null && (c71Var = e71Var.W2) != null && e71Var.G) {
                    c71Var.N(true);
                    return;
                }
                return;
        }
    }
}
