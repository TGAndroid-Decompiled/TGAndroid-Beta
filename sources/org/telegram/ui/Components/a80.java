package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a80 implements Runnable {
    public final int f22329a;
    public final g80 f22330b;
    public final TLRPC.TL_chatInviteJoinResultWebView f22331c;
    public final long d;

    public a80(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f22329a = i10;
        this.f22330b = g80Var;
        this.f22331c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f22329a) {
            case 0:
                g80.p(this.f22330b, this.f22331c, this.d);
                return;
            default:
                g80.o(this.f22330b, this.f22331c, this.d);
                return;
        }
    }
}
