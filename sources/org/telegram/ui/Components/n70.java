package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n70 implements Runnable {
    public final int f28698a;
    public final u70 f28699b;
    public final TLRPC.TL_chatInviteJoinResultWebView f28700c;
    public final long d;

    public n70(u70 u70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f28698a = i10;
        this.f28699b = u70Var;
        this.f28700c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28698a) {
            case 0:
                u70 u70Var = this.f28699b;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(u70Var.f21583a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f28700c;
                r12.V3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.o2.b(u70Var.f21583a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                u70 u70Var2 = this.f28699b;
                org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(u70Var2.f21583a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f28700c;
                r13.V3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.o2.b(u70Var2.f21583a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
