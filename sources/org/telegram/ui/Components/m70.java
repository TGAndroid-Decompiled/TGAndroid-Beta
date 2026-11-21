package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class m70 implements Runnable {
    public final int f37440a;
    public final r70 f37441b;
    public final TLRPC.TL_chatInviteJoinResultWebView f37442c;
    public final long d;

    public m70(r70 r70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.f37440a = i7;
        this.f37441b = r70Var;
        this.f37442c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f37440a) {
            case 0:
                r70 r70Var = this.f37441b;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(r70Var.f30170a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f37442c;
                u12.f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2.b(r70Var.f30170a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                r70 r70Var2 = this.f37441b;
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(r70Var2.f30170a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f37442c;
                u13.f4(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.l2.b(r70Var2.f30170a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
