package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j80 implements Runnable {
    public final int f24310a;
    public final q80 f24311b;
    public final TLRPC.TL_chatInviteJoinResultWebView f24312c;
    public final long d;

    public j80(q80 q80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f24310a = i10;
        this.f24311b = q80Var;
        this.f24312c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f24310a) {
            case 0:
                q80.p(this.f24311b, this.f24312c, this.d);
                return;
            default:
                q80.o(this.f24311b, this.f24312c, this.d);
                return;
        }
    }
}
