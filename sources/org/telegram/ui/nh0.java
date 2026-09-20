package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f36026a;
    public final ai0 f36027b;
    public final TLRPC.TL_chatInviteExported f36028c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f36029f;

    public nh0(ai0 ai0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f36026a = i10;
        this.f36027b = ai0Var;
        this.f36028c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f36029f = z10;
    }

    @Override
    public final void run() {
        switch (this.f36026a) {
            case 0:
                ai0 ai0Var = this.f36027b;
                ai0Var.getNotificationCenter().doOnIdle(new nh0(ai0Var, this.f36028c, this.d, this.e, this.f36029f, 1));
                return;
            default:
                ai0.U(this.f36027b, this.f36028c, this.d, this.e, this.f36029f);
                return;
        }
    }
}
