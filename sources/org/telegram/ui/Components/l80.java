package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l80 implements Runnable {
    public final int f26043a;
    public final r80 f26044b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26045c;
    public final long d;

    public l80(r80 r80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f26043a = i10;
        this.f26044b = r80Var;
        this.f26045c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26043a) {
            case 0:
                r80.p(this.f26044b, this.f26045c, this.d);
                return;
            default:
                r80.o(this.f26044b, this.f26045c, this.d);
                return;
        }
    }
}
