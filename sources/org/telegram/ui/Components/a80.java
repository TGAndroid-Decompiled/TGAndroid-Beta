package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a80 implements Runnable {
    public final int f22345a;
    public final g80 f22346b;
    public final TLRPC.TL_chatInviteJoinResultWebView f22347c;
    public final long d;

    public a80(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f22345a = i10;
        this.f22346b = g80Var;
        this.f22347c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f22345a) {
            case 0:
                g80.p(this.f22346b, this.f22347c, this.d);
                return;
            default:
                g80.o(this.f22346b, this.f22347c, this.d);
                return;
        }
    }
}
