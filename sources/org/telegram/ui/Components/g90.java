package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g90 implements Runnable {
    public final int f26363a;
    public final m90 f26364b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26365c;
    public final long d;

    public g90(m90 m90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f26363a = i10;
        this.f26364b = m90Var;
        this.f26365c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26363a) {
            case 0:
                m90.r(this.f26364b, this.f26365c, this.d);
                return;
            default:
                m90.q(this.f26364b, this.f26365c, this.d);
                return;
        }
    }
}
