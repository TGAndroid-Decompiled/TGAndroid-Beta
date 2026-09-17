package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f38386a;
    public final yh0 f38387b;
    public final TLRPC.TL_chatInviteExported f38388c;
    public final TLRPC.TL_error d;
    public final TLObject f38389e;
    public final boolean f38390f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f38386a = i10;
        this.f38387b = yh0Var;
        this.f38388c = tL_chatInviteExported;
        this.d = tL_error;
        this.f38389e = tLObject;
        this.f38390f = z10;
    }

    @Override
    public final void run() {
        switch (this.f38386a) {
            case 0:
                yh0 yh0Var = this.f38387b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f38388c, this.d, this.f38389e, this.f38390f, 1));
                return;
            default:
                yh0.U(this.f38387b, this.f38388c, this.d, this.f38389e, this.f38390f);
                return;
        }
    }
}
