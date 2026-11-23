package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class m70 implements Runnable {
    public final int f37398a;
    public final r70 f37399b;
    public final TLRPC.TL_chatInviteJoinResultWebView f37400c;
    public final long d;

    public m70(r70 r70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.f37398a = i7;
        this.f37399b = r70Var;
        this.f37400c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f37398a) {
            case 0:
                r70 r70Var = this.f37399b;
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(r70Var.f30139a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.f37400c;
                u12.f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2.b(r70Var.f30139a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                r70 r70Var2 = this.f37399b;
                org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(r70Var2.f30139a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.f37400c;
                u13.f4(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.l2.b(r70Var2.f30139a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                return;
        }
    }
}
