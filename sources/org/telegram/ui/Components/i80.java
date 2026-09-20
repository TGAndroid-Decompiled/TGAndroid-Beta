package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i80 implements Runnable {
    public final int f24943a;
    public final o80 f24944b;
    public final TLRPC.TL_chatInviteJoinResultWebView f24945c;
    public final long d;

    public i80(o80 o80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f24943a = i10;
        this.f24944b = o80Var;
        this.f24945c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f24943a) {
            case 0:
                o80.p(this.f24944b, this.f24945c, this.d);
                return;
            default:
                o80.o(this.f24944b, this.f24945c, this.d);
                return;
        }
    }
}
