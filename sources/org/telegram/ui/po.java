package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f40924a;
    public final long f40925b;
    public final long f40926c;
    public final org.telegram.ui.ActionBar.m2 d;

    public po(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.f40924a = i10;
        this.d = m2Var;
        this.f40925b = j3;
        this.f40926c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.e71 e71Var;
        switch (this.f40924a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40925b, this.f40926c, new a5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                y1Var.f43741f = this.f40925b;
                y1Var.h = this.f40926c;
                org.telegram.ui.Components.g71 g71Var = y1Var.f26922a;
                if (g71Var != null && (e71Var = g71Var.W2) != null && g71Var.G) {
                    e71Var.N(true);
                    return;
                }
                return;
        }
    }
}
