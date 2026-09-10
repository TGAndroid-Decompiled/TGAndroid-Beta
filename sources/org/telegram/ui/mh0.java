package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f34948a;
    public final zh0 f34949b;
    public final TLRPC.TL_chatInviteExported f34950c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f34951f;

    public mh0(zh0 zh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f34948a = i10;
        this.f34949b = zh0Var;
        this.f34950c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f34951f = z10;
    }

    @Override
    public final void run() {
        switch (this.f34948a) {
            case 0:
                zh0 zh0Var = this.f34949b;
                zh0Var.getNotificationCenter().doOnIdle(new mh0(zh0Var, this.f34950c, this.d, this.e, this.f34951f, 1));
                return;
            default:
                zh0.U(this.f34949b, this.f34950c, this.d, this.e, this.f34951f);
                return;
        }
    }
}
