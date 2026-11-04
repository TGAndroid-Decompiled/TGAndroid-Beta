package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r60 implements Runnable {
    public final int f37661a;
    public final x60 f37662b;
    public final TLRPC.TL_chatInviteJoinResultWebView f37663c;
    public final long d;

    public r60(x60 x60Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i3) {
        this.f37661a = i3;
        this.f37662b = x60Var;
        this.f37663c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f37661a) {
            case 0:
                x60 x60Var = this.f37662b;
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(x60Var.f28583a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f37663c;
                s12.Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(x60Var.f28583a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                x60 x60Var2 = this.f37662b;
                org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(x60Var2.f28583a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f37663c;
                s13.Y3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.k2.b(x60Var2.f28583a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
