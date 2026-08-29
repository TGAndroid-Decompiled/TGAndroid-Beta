package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x70 implements Runnable {
    public final int f34645a;
    public final c80 f34646b;
    public final TLRPC.TL_chatInviteJoinResultWebView f34647c;
    public final long d;

    public x70(c80 c80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f34645a = i10;
        this.f34646b = c80Var;
        this.f34647c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34645a) {
            case 0:
                c80.p(this.f34646b, this.f34647c, this.d);
                return;
            default:
                c80.o(this.f34646b, this.f34647c, this.d);
                return;
        }
    }
}
