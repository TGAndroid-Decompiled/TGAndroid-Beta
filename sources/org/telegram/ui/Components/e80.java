package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class e80 implements Runnable {
    public final int f26480a;
    public final j80 f26481b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26482c;
    public final long d;

    public e80(j80 j80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f26480a = i10;
        this.f26481b = j80Var;
        this.f26482c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26480a) {
            case 0:
                j80.p(this.f26481b, this.f26482c, this.d);
                return;
            default:
                j80.o(this.f26481b, this.f26482c, this.d);
                return;
        }
    }
}
