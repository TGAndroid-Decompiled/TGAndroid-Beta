package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class m80 implements Runnable {
    public final int f26332a;
    public final s80 f26333b;
    public final TLRPC.TL_chatInviteJoinResultWebView f26334c;
    public final long d;

    public m80(s80 s80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.f26332a = i10;
        this.f26333b = s80Var;
        this.f26334c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26332a) {
            case 0:
                s80.p(this.f26333b, this.f26334c, this.d);
                return;
            default:
                s80.o(this.f26333b, this.f26334c, this.d);
                return;
        }
    }
}
