package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a80 implements Runnable {
    public final int f24301a;
    public final g80 f24302b;
    public final TLRPC.TL_chatInviteJoinResultWebView f24303c;
    public final long d;

    public a80(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f24301a = i10;
        this.f24302b = g80Var;
        this.f24303c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f24301a) {
            case 0:
                g80.p(this.f24302b, this.f24303c, this.d);
                return;
            default:
                g80.o(this.f24302b, this.f24303c, this.d);
                return;
        }
    }
}
