package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z80 implements Runnable {
    public final int f31502a;
    public final f90 f31503b;
    public final TLRPC.TL_chatInviteJoinResultWebView f31504c;
    public final long d;

    public z80(f90 f90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.f31502a = i10;
        this.f31503b = f90Var;
        this.f31504c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f31502a) {
            case 0:
                f90.r(this.f31503b, this.f31504c, this.d);
                return;
            default:
                f90.q(this.f31503b, this.f31504c, this.d);
                return;
        }
    }
}
