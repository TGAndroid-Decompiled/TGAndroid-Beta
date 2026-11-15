package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z60 implements Runnable {
    public final int f42262a;
    public final e70 f42263b;
    public final TLRPC.TL_chatInviteJoinResultWebView f42264c;
    public final long d;

    public z60(e70 e70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.f42262a = i7;
        this.f42263b = e70Var;
        this.f42264c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f42262a) {
            case 0:
                e70 e70Var = this.f42263b;
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(e70Var.f29679a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f42264c;
                s12.Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(e70Var.f29679a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                e70 e70Var2 = this.f42263b;
                org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(e70Var2.f29679a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f42264c;
                s13.Y3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.k2.b(e70Var2.f29679a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
