package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f36684a;
    public final long f36685b;
    public final long f36686c;
    public final org.telegram.ui.ActionBar.n2 d;

    public po(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f36684a = i10;
        this.d = n2Var;
        this.f36685b = j3;
        this.f36686c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.m61 m61Var;
        switch (this.f36684a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36685b, this.f36686c, new b5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.f36685b;
                a2Var.f38846n = this.f36686c;
                org.telegram.ui.Components.o61 o61Var = a2Var.f27268a;
                if (o61Var != null && (m61Var = o61Var.Y2) != null && o61Var.G) {
                    m61Var.N(true);
                    return;
                }
                return;
        }
    }
}
