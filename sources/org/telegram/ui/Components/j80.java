package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j80 implements Runnable {
    public final int f25234a;
    public final p80 f25235b;
    public final TLRPC.TL_chatInviteJoinResultWebView f25236c;
    public final long d;

    public j80(p80 p80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f25234a = i10;
        this.f25235b = p80Var;
        this.f25236c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25234a) {
            case 0:
                p80.p(this.f25235b, this.f25236c, this.d);
                return;
            default:
                p80.o(this.f25235b, this.f25236c, this.d);
                return;
        }
    }
}
