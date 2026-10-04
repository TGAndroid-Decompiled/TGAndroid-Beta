package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f29284a;
    public final u80 f29285b;
    public final TLRPC.TL_chatInviteJoinResultWebView f29286c;
    public final long d;

    public o80(u80 u80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f29284a = i10;
        this.f29285b = u80Var;
        this.f29286c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f29284a) {
            case 0:
                u80.p(this.f29285b, this.f29286c, this.d);
                return;
            default:
                u80.o(this.f29285b, this.f29286c, this.d);
                return;
        }
    }
}
