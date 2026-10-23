package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class w80 implements Runnable {
    public final int f32186a;
    public final b90 f32187b;
    public final TLRPC.TL_chatInviteJoinResultWebView f32188c;
    public final long d;

    public w80(b90 b90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f32186a = i10;
        this.f32187b = b90Var;
        this.f32188c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f32186a) {
            case 0:
                b90.q(this.f32187b, this.f32188c, this.d);
                return;
            default:
                b90.p(this.f32187b, this.f32188c, this.d);
                return;
        }
    }
}
