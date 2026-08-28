package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k70 implements Runnable {
    public final int f30019a;
    public final p70 f30020b;
    public final TLRPC.TL_chatInviteJoinResultWebView f30021c;
    public final long d;

    public k70(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i9) {
        this.f30019a = i9;
        this.f30020b = p70Var;
        this.f30021c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f30019a) {
            case 0:
                p70.p(this.f30020b, this.f30021c, this.d);
                return;
            default:
                p70.o(this.f30020b, this.f30021c, this.d);
                return;
        }
    }
}
