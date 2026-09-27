package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n80 implements Runnable {
    public final int f26746a;
    public final t80 f26747b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26748c;
    public final long d;

    public n80(t80 t80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f26746a = i10;
        this.f26747b = t80Var;
        this.f26748c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26746a) {
            case 0:
                t80.p(this.f26747b, this.f26748c, this.d);
                return;
            default:
                t80.o(this.f26747b, this.f26748c, this.d);
                return;
        }
    }
}
