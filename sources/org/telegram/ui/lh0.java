package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f39668a;
    public final yh0 f39669b;
    public final TLRPC.TL_chatInviteExported f39670c;
    public final TLRPC.TL_error d;
    public final TLObject f39671e;
    public final boolean f39672f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f39668a = i10;
        this.f39669b = yh0Var;
        this.f39670c = tL_chatInviteExported;
        this.d = tL_error;
        this.f39671e = tLObject;
        this.f39672f = z10;
    }

    @Override
    public final void run() {
        switch (this.f39668a) {
            case 0:
                yh0 yh0Var = this.f39669b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f39670c, this.d, this.f39671e, this.f39672f, 1));
                return;
            default:
                yh0.U(this.f39669b, this.f39670c, this.d, this.f39671e, this.f39672f);
                return;
        }
    }
}
