package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class v80 implements Runnable {
    public final int f31197a;
    public final a90 f31198b;
    public final TLRPC.TL_chatInviteJoinResultWebView f31199c;
    public final long d;

    public v80(a90 a90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f31197a = i10;
        this.f31198b = a90Var;
        this.f31199c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f31197a) {
            case 0:
                a90.q(this.f31198b, this.f31199c, this.d);
                return;
            default:
                a90.p(this.f31198b, this.f31199c, this.d);
                return;
        }
    }
}
