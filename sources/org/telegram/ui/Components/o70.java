package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class o70 implements Runnable {

    public final int f31200a;

    public final t70 f31201b;

    public final TLRPC.TL_chatInviteJoinResultWebView f31202c;
    public final long d;

    public o70(t70 t70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f31200a = i10;
        this.f31201b = t70Var;
        this.f31202c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f31200a) {
            case 0:
                t70.q(this.f31201b, this.f31202c, this.d);
                break;
            default:
                t70.p(this.f31201b, this.f31202c, this.d);
                break;
        }
    }
}
