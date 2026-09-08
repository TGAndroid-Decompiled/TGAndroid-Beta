package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f38385a;
    public final yh0 f38386b;
    public final TLRPC.TL_chatInviteExported f38387c;
    public final TLRPC.TL_error d;
    public final TLObject f38388e;
    public final boolean f38389f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f38385a = i10;
        this.f38386b = yh0Var;
        this.f38387c = tL_chatInviteExported;
        this.d = tL_error;
        this.f38388e = tLObject;
        this.f38389f = z10;
    }

    @Override
    public final void run() {
        switch (this.f38385a) {
            case 0:
                yh0 yh0Var = this.f38386b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f38387c, this.d, this.f38388e, this.f38389f, 1));
                return;
            default:
                yh0.U(this.f38386b, this.f38387c, this.d, this.f38388e, this.f38389f);
                return;
        }
    }
}
