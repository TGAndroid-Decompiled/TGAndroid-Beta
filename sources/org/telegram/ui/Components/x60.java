package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x60 implements Runnable {
    public final int f40309a;
    public final c70 f40310b;
    public final TLRPC.TL_chatInviteJoinResultWebView f40311c;
    public final long d;

    public x60(c70 c70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.f40309a = i7;
        this.f40310b = c70Var;
        this.f40311c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f40309a) {
            case 0:
                c70 c70Var = this.f40310b;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(c70Var.f28621a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f40311c;
                s12.Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(c70Var.f28621a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                c70 c70Var2 = this.f40310b;
                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(c70Var2.f28621a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f40311c;
                s13.Y3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.k2.b(c70Var2.f28621a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
