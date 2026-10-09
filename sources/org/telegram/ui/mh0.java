package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f39916a;
    public final zh0 f39917b;
    public final TLRPC.TL_chatInviteExported f39918c;
    public final TLRPC.TL_error d;
    public final TLObject f39919e;
    public final boolean f39920f;

    public mh0(zh0 zh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f39916a = i10;
        this.f39917b = zh0Var;
        this.f39918c = tL_chatInviteExported;
        this.d = tL_error;
        this.f39919e = tLObject;
        this.f39920f = z10;
    }

    @Override
    public final void run() {
        switch (this.f39916a) {
            case 0:
                zh0 zh0Var = this.f39917b;
                zh0Var.getNotificationCenter().doOnIdle(new mh0(zh0Var, this.f39918c, this.d, this.f39919e, this.f39920f, 1));
                return;
            default:
                zh0.U(this.f39917b, this.f39918c, this.d, this.f39919e, this.f39920f);
                return;
        }
    }
}
