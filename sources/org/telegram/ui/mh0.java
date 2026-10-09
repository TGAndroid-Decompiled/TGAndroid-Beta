package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f39914a;
    public final zh0 f39915b;
    public final TLRPC.TL_chatInviteExported f39916c;
    public final TLRPC.TL_error d;
    public final TLObject f39917e;
    public final boolean f39918f;

    public mh0(zh0 zh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f39914a = i10;
        this.f39915b = zh0Var;
        this.f39916c = tL_chatInviteExported;
        this.d = tL_error;
        this.f39917e = tLObject;
        this.f39918f = z10;
    }

    @Override
    public final void run() {
        switch (this.f39914a) {
            case 0:
                zh0 zh0Var = this.f39915b;
                zh0Var.getNotificationCenter().doOnIdle(new mh0(zh0Var, this.f39916c, this.d, this.f39917e, this.f39918f, 1));
                return;
            default:
                zh0.U(this.f39915b, this.f39916c, this.d, this.f39917e, this.f39918f);
                return;
        }
    }
}
