package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class u80 implements Runnable {
    public final int f31045a;
    public final z80 f31046b;
    public final TLRPC.TL_chatInviteJoinResultWebView f31047c;
    public final long d;

    public u80(z80 z80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f31045a = i10;
        this.f31046b = z80Var;
        this.f31047c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f31045a) {
            case 0:
                z80.q(this.f31046b, this.f31047c, this.d);
                return;
            default:
                z80.p(this.f31046b, this.f31047c, this.d);
                return;
        }
    }
}
