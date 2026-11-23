package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j70 implements Runnable {
    public final int f36318a;
    public final o70 f36319b;
    public final TLRPC.TL_chatInviteJoinResultWebView f36320c;
    public final long d;

    public j70(o70 o70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.f36318a = i7;
        this.f36319b = o70Var;
        this.f36320c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f36318a) {
            case 0:
                o70 o70Var = this.f36319b;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(o70Var.f30223a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f36320c;
                u12.f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2.b(o70Var.f30223a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                o70 o70Var2 = this.f36319b;
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(o70Var2.f30223a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f36320c;
                u13.f4(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.l2.b(o70Var2.f30223a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
