package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 implements Runnable {
    public final int f33568a;
    public final th0 f33569b;
    public final TLRPC.TL_chatInviteExported f33570c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f33571f;

    public gh0(th0 th0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f33568a = i10;
        this.f33569b = th0Var;
        this.f33570c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f33571f = z10;
    }

    @Override
    public final void run() {
        switch (this.f33568a) {
            case 0:
                th0 th0Var = this.f33569b;
                th0Var.getNotificationCenter().doOnIdle(new gh0(th0Var, this.f33570c, this.d, this.e, this.f33571f, 1));
                return;
            default:
                th0.U(this.f33569b, this.f33570c, this.d, this.e, this.f33571f);
                return;
        }
    }
}
