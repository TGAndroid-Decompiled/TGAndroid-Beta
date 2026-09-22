package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l80 implements Runnable {
    public final int f26020a;
    public final r80 f26021b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26022c;
    public final long d;

    public l80(r80 r80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f26020a = i10;
        this.f26021b = r80Var;
        this.f26022c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26020a) {
            case 0:
                r80.p(this.f26021b, this.f26022c, this.d);
                return;
            default:
                r80.o(this.f26021b, this.f26022c, this.d);
                return;
        }
    }
}
