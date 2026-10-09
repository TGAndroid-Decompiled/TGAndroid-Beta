package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f40857a;
    public final long f40858b;
    public final long f40859c;
    public final org.telegram.ui.ActionBar.n2 d;

    public po(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f40857a = i10;
        this.d = n2Var;
        this.f40858b = j3;
        this.f40859c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.c71 c71Var;
        switch (this.f40857a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40858b, this.f40859c, new b5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f43564f = this.f40858b;
                z1Var.h = this.f40859c;
                org.telegram.ui.Components.e71 e71Var = z1Var.f26290a;
                if (e71Var != null && (c71Var = e71Var.W2) != null && e71Var.G) {
                    c71Var.N(true);
                    return;
                }
                return;
        }
    }
}
