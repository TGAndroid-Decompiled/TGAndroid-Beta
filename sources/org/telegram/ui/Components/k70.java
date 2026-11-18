package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k70 implements Runnable {
    public final int f36698a;
    public final p70 f36699b;
    public final TLRPC.TL_chatInviteJoinResultWebView f36700c;
    public final long d;

    public k70(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.f36698a = i7;
        this.f36699b = p70Var;
        this.f36700c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f36698a) {
            case 0:
                p70 p70Var = this.f36699b;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(p70Var.f30187a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f36700c;
                u12.f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2.b(p70Var.f30187a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                p70 p70Var2 = this.f36699b;
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(p70Var2.f30187a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f36700c;
                u13.f4(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.l2.b(p70Var2.f30187a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
