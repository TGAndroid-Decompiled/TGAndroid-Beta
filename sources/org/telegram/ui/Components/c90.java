package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c90 implements Runnable {
    public final int f25267a;
    public final i90 f25268b;
    public final TLRPC.TL_chatInviteJoinResultWebView f25269c;
    public final long d;

    public c90(i90 i90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f25267a = i10;
        this.f25268b = i90Var;
        this.f25269c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25267a) {
            case 0:
                i90.r(this.f25268b, this.f25269c, this.d);
                return;
            default:
                i90.q(this.f25268b, this.f25269c, this.d);
                return;
        }
    }
}
