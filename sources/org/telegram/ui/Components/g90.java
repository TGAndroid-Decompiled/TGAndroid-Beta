package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g90 implements Runnable {
    public final int f26361a;
    public final m90 f26362b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26363c;
    public final long d;

    public g90(m90 m90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f26361a = i10;
        this.f26362b = m90Var;
        this.f26363c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26361a) {
            case 0:
                m90.r(this.f26362b, this.f26363c, this.d);
                return;
            default:
                m90.q(this.f26362b, this.f26363c, this.d);
                return;
        }
    }
}
