package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a80 implements Runnable {
    public final int f24302a;
    public final g80 f24303b;
    public final TLRPC.TL_chatInviteJoinResultWebView f24304c;
    public final long d;

    public a80(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f24302a = i10;
        this.f24303b = g80Var;
        this.f24304c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f24302a) {
            case 0:
                g80.p(this.f24303b, this.f24304c, this.d);
                return;
            default:
                g80.o(this.f24303b, this.f24304c, this.d);
                return;
        }
    }
}
