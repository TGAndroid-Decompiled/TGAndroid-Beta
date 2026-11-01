package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n70 implements Runnable {
    public final int f28697a;
    public final u70 f28698b;
    public final TLRPC.TL_chatInviteJoinResultWebView f28699c;
    public final long d;

    public n70(u70 u70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f28697a = i10;
        this.f28698b = u70Var;
        this.f28699c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28697a) {
            case 0:
                u70 u70Var = this.f28698b;
                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(u70Var.f21584a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f28699c;
                r12.V3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.o2.b(u70Var.f21584a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                u70 u70Var2 = this.f28698b;
                org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(u70Var2.f21584a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f28699c;
                r13.V3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.o2.b(u70Var2.f21584a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
