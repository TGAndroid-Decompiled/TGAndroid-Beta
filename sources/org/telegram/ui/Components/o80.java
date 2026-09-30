package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f27024a;
    public final u80 f27025b;
    public final TLRPC.TL_chatInviteJoinResultWebView f27026c;
    public final long d;

    public o80(u80 u80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f27024a = i10;
        this.f27025b = u80Var;
        this.f27026c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27024a) {
            case 0:
                u80.p(this.f27025b, this.f27026c, this.d);
                return;
            default:
                u80.o(this.f27025b, this.f27026c, this.d);
                return;
        }
    }
}
