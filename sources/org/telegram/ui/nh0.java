package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f40416a;
    public final ai0 f40417b;
    public final TLRPC.TL_chatInviteExported f40418c;
    public final TLRPC.TL_error d;
    public final TLObject f40419e;
    public final boolean f40420f;

    public nh0(ai0 ai0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f40416a = i10;
        this.f40417b = ai0Var;
        this.f40418c = tL_chatInviteExported;
        this.d = tL_error;
        this.f40419e = tLObject;
        this.f40420f = z10;
    }

    @Override
    public final void run() {
        switch (this.f40416a) {
            case 0:
                ai0 ai0Var = this.f40417b;
                ai0Var.getNotificationCenter().doOnIdle(new nh0(ai0Var, this.f40418c, this.d, this.f40419e, this.f40420f, 1));
                return;
            default:
                ai0.U(this.f40417b, this.f40418c, this.d, this.f40419e, this.f40420f);
                return;
        }
    }
}
