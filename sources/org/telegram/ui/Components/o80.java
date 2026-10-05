package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f29402a;
    public final u80 f29403b;
    public final TLRPC.TL_chatInviteJoinResultWebView f29404c;
    public final long d;

    public o80(u80 u80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f29402a = i10;
        this.f29403b = u80Var;
        this.f29404c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f29402a) {
            case 0:
                u80.p(this.f29403b, this.f29404c, this.d);
                return;
            default:
                u80.o(this.f29403b, this.f29404c, this.d);
                return;
        }
    }
}
