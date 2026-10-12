package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a90 implements Runnable {
    public final int f23491a;
    public final g90 f23492b;
    public final TLRPC.TL_chatInviteJoinResultWebView f23493c;
    public final long d;

    public a90(g90 g90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f23491a = i10;
        this.f23492b = g90Var;
        this.f23493c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f23491a) {
            case 0:
                g90.r(this.f23492b, this.f23493c, this.d);
                return;
            default:
                g90.q(this.f23492b, this.f23493c, this.d);
                return;
        }
    }
}
