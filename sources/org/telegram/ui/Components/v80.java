package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class v80 implements Runnable {
    public final int f31194a;
    public final a90 f31195b;
    public final TLRPC.TL_chatInviteJoinResultWebView f31196c;
    public final long d;

    public v80(a90 a90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f31194a = i10;
        this.f31195b = a90Var;
        this.f31196c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f31194a) {
            case 0:
                a90.q(this.f31195b, this.f31196c, this.d);
                return;
            default:
                a90.p(this.f31195b, this.f31196c, this.d);
                return;
        }
    }
}
