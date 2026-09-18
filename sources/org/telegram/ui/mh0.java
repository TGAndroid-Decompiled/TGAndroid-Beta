package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f35669a;
    public final zh0 f35670b;
    public final TLRPC.TL_chatInviteExported f35671c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f35672f;

    public mh0(zh0 zh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f35669a = i10;
        this.f35670b = zh0Var;
        this.f35671c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f35672f = z10;
    }

    @Override
    public final void run() {
        switch (this.f35669a) {
            case 0:
                zh0 zh0Var = this.f35670b;
                zh0Var.getNotificationCenter().doOnIdle(new mh0(zh0Var, this.f35671c, this.d, this.e, this.f35672f, 1));
                return;
            default:
                zh0.U(this.f35670b, this.f35671c, this.d, this.e, this.f35672f);
                return;
        }
    }
}
