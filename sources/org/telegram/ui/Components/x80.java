package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x80 implements Runnable {
    public final int f34658a;
    public final c90 f34659b;
    public final TLRPC.TL_chatInviteJoinResultWebView f34660c;
    public final long d;

    public x80(c90 c90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f34658a = i10;
        this.f34659b = c90Var;
        this.f34660c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34658a) {
            case 0:
                c90.p(this.f34659b, this.f34660c, this.d);
                return;
            default:
                c90.o(this.f34659b, this.f34660c, this.d);
                return;
        }
    }
}
