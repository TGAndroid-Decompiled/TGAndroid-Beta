package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d90 implements Runnable {
    public final int f25493a;
    public final j90 f25494b;
    public final TLRPC.TL_chatInviteJoinResultWebView f25495c;
    public final long d;

    public d90(j90 j90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f25493a = i10;
        this.f25494b = j90Var;
        this.f25495c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25493a) {
            case 0:
                j90.r(this.f25494b, this.f25495c, this.d);
                return;
            default:
                j90.q(this.f25494b, this.f25495c, this.d);
                return;
        }
    }
}
