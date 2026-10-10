package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d90 implements Runnable {
    public final int f25600a;
    public final j90 f25601b;
    public final TLRPC.TL_chatInviteJoinResultWebView f25602c;
    public final long d;

    public d90(j90 j90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f25600a = i10;
        this.f25601b = j90Var;
        this.f25602c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25600a) {
            case 0:
                j90.r(this.f25601b, this.f25602c, this.d);
                return;
            default:
                j90.q(this.f25601b, this.f25602c, this.d);
                return;
        }
    }
}
