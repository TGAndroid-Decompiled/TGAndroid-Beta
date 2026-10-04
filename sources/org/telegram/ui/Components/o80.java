package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f29278a;
    public final u80 f29279b;
    public final TLRPC.TL_chatInviteJoinResultWebView f29280c;
    public final long d;

    public o80(u80 u80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f29278a = i10;
        this.f29279b = u80Var;
        this.f29280c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f29278a) {
            case 0:
                u80.p(this.f29279b, this.f29280c, this.d);
                return;
            default:
                u80.o(this.f29279b, this.f29280c, this.d);
                return;
        }
    }
}
