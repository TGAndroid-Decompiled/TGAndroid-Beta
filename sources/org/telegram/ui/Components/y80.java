package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y80 implements Runnable {
    public final int f34998a;
    public final d90 f34999b;
    public final TLRPC.TL_chatInviteJoinResultWebView f35000c;
    public final long d;

    public y80(d90 d90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f34998a = i10;
        this.f34999b = d90Var;
        this.f35000c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34998a) {
            case 0:
                d90.p(this.f34999b, this.f35000c, this.d);
                return;
            default:
                d90.o(this.f34999b, this.f35000c, this.d);
                return;
        }
    }
}
