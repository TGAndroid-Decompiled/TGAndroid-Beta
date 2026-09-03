package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d80 implements Runnable {
    public final int f24227a;
    public final i80 f24228b;
    public final TLRPC.TL_chatInviteJoinResultWebView f24229c;
    public final long d;

    public d80(i80 i80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f24227a = i10;
        this.f24228b = i80Var;
        this.f24229c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f24227a) {
            case 0:
                i80.p(this.f24228b, this.f24229c, this.d);
                return;
            default:
                i80.o(this.f24228b, this.f24229c, this.d);
                return;
        }
    }
}
