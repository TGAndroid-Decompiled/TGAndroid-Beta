package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b80 implements Runnable {
    public final int f22598a;
    public final h80 f22599b;
    public final TLRPC.TL_chatInviteJoinResultWebView f22600c;
    public final long d;

    public b80(h80 h80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f22598a = i10;
        this.f22599b = h80Var;
        this.f22600c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f22598a) {
            case 0:
                h80.p(this.f22599b, this.f22600c, this.d);
                return;
            default:
                h80.o(this.f22599b, this.f22600c, this.d);
                return;
        }
    }
}
