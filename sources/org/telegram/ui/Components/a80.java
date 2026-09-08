package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a80 implements Runnable {
    public final int f24328a;
    public final g80 f24329b;
    public final TLRPC.TL_chatInviteJoinResultWebView f24330c;
    public final long d;

    public a80(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f24328a = i10;
        this.f24329b = g80Var;
        this.f24330c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f24328a) {
            case 0:
                g80.p(this.f24329b, this.f24330c, this.d);
                return;
            default:
                g80.o(this.f24329b, this.f24330c, this.d);
                return;
        }
    }
}
