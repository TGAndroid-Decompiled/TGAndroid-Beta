package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class eo implements Runnable {
    public final int f37998a;
    public final long f37999b;
    public final long f38000c;
    public final org.telegram.ui.ActionBar.o2 d;

    public eo(org.telegram.ui.ActionBar.o2 o2Var, long j10, long j11, int i9) {
        this.f37998a = i9;
        this.d = o2Var;
        this.f37999b = j10;
        this.f38000c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z41 z41Var;
        switch (this.f37998a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f37999b, this.f38000c, new a5((ho) this.d, 4));
                return;
            default:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.d;
                u1Var.f44031f = this.f37999b;
                u1Var.h = this.f38000c;
                org.telegram.ui.Components.c51 c51Var = u1Var.f27658a;
                if (c51Var != null && (z41Var = c51Var.U2) != null && c51Var.C) {
                    z41Var.N(true);
                    return;
                }
                return;
        }
    }
}
