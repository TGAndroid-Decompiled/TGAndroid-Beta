package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f39960a;
    public final zh0 f39961b;
    public final TLRPC.TL_chatInviteExported f39962c;
    public final TLRPC.TL_error d;
    public final TLObject f39963e;
    public final boolean f39964f;

    public mh0(zh0 zh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f39960a = i10;
        this.f39961b = zh0Var;
        this.f39962c = tL_chatInviteExported;
        this.d = tL_error;
        this.f39963e = tLObject;
        this.f39964f = z10;
    }

    @Override
    public final void run() {
        switch (this.f39960a) {
            case 0:
                zh0 zh0Var = this.f39961b;
                zh0Var.getNotificationCenter().doOnIdle(new mh0(zh0Var, this.f39962c, this.d, this.f39963e, this.f39964f, 1));
                return;
            default:
                zh0.U(this.f39961b, this.f39962c, this.d, this.f39963e, this.f39964f);
                return;
        }
    }
}
