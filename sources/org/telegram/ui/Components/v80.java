package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class v80 implements Runnable {
    public final int f31229a;
    public final a90 f31230b;
    public final TLRPC.TL_chatInviteJoinResultWebView f31231c;
    public final long d;

    public v80(a90 a90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f31229a = i10;
        this.f31230b = a90Var;
        this.f31231c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f31229a) {
            case 0:
                a90.q(this.f31230b, this.f31231c, this.d);
                return;
            default:
                a90.p(this.f31230b, this.f31231c, this.d);
                return;
        }
    }
}
