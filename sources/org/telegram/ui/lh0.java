package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f39702a;
    public final yh0 f39703b;
    public final TLRPC.TL_chatInviteExported f39704c;
    public final TLRPC.TL_error d;
    public final TLObject f39705e;
    public final boolean f39706f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f39702a = i10;
        this.f39703b = yh0Var;
        this.f39704c = tL_chatInviteExported;
        this.d = tL_error;
        this.f39705e = tLObject;
        this.f39706f = z10;
    }

    @Override
    public final void run() {
        switch (this.f39702a) {
            case 0:
                yh0 yh0Var = this.f39703b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f39704c, this.d, this.f39705e, this.f39706f, 1));
                return;
            default:
                yh0.U(this.f39703b, this.f39704c, this.d, this.f39705e, this.f39706f);
                return;
        }
    }
}
