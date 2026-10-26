package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x80 implements Runnable {
    public final int f34661a;
    public final c90 f34662b;
    public final TLRPC.TL_chatInviteJoinResultWebView f34663c;
    public final long d;

    public x80(c90 c90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f34661a = i10;
        this.f34662b = c90Var;
        this.f34663c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34661a) {
            case 0:
                c90.p(this.f34662b, this.f34663c, this.d);
                return;
            default:
                c90.o(this.f34662b, this.f34663c, this.d);
                return;
        }
    }
}
