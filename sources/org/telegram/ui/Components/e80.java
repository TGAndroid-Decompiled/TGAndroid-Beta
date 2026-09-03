package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class e80 implements Runnable {
    public final int f26493a;
    public final j80 f26494b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26495c;
    public final long d;

    public e80(j80 j80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f26493a = i10;
        this.f26494b = j80Var;
        this.f26495c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26493a) {
            case 0:
                j80.p(this.f26494b, this.f26495c, this.d);
                return;
            default:
                j80.o(this.f26494b, this.f26495c, this.d);
                return;
        }
    }
}
