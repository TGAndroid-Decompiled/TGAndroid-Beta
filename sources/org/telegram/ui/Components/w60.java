package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class w60 implements Runnable {
    public final int f39865a;
    public final b70 f39866b;
    public final TLRPC.TL_chatInviteJoinResultWebView f39867c;
    public final long d;

    public w60(b70 b70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.f39865a = i7;
        this.f39866b = b70Var;
        this.f39867c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f39865a) {
            case 0:
                b70 b70Var = this.f39866b;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(b70Var.f28612a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f39867c;
                s12.Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(b70Var.f28612a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                b70 b70Var2 = this.f39866b;
                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(b70Var2.f28612a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f39867c;
                s13.Y3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.k2.b(b70Var2.f28612a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
