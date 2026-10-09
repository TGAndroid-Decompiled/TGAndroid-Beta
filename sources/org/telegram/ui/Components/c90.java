package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c90 implements Runnable {
    public final int f25297a;
    public final i90 f25298b;
    public final TLRPC.TL_chatInviteJoinResultWebView f25299c;
    public final long d;

    public c90(i90 i90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f25297a = i10;
        this.f25298b = i90Var;
        this.f25299c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25297a) {
            case 0:
                i90.r(this.f25298b, this.f25299c, this.d);
                return;
            default:
                i90.q(this.f25298b, this.f25299c, this.d);
                return;
        }
    }
}
