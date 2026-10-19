package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class v80 implements Runnable {
    public final int f31199a;
    public final a90 f31200b;
    public final TLRPC.TL_chatInviteJoinResultWebView f31201c;
    public final long d;

    public v80(a90 a90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f31199a = i10;
        this.f31200b = a90Var;
        this.f31201c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f31199a) {
            case 0:
                a90.q(this.f31200b, this.f31201c, this.d);
                return;
            default:
                a90.p(this.f31200b, this.f31201c, this.d);
                return;
        }
    }
}
