package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c80 implements Runnable {
    public final int f23919a;
    public final h80 f23920b;
    public final TLRPC.TL_chatInviteJoinResultWebView f23921c;
    public final long d;

    public c80(h80 h80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f23919a = i10;
        this.f23920b = h80Var;
        this.f23921c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f23919a) {
            case 0:
                h80.p(this.f23920b, this.f23921c, this.d);
                return;
            default:
                h80.o(this.f23920b, this.f23921c, this.d);
                return;
        }
    }
}
