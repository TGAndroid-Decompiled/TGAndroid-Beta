package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f36112a;
    public final ai0 f36113b;
    public final TLRPC.TL_chatInviteExported f36114c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f36115f;

    public nh0(ai0 ai0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f36112a = i10;
        this.f36113b = ai0Var;
        this.f36114c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f36115f = z10;
    }

    @Override
    public final void run() {
        switch (this.f36112a) {
            case 0:
                ai0 ai0Var = this.f36113b;
                ai0Var.getNotificationCenter().doOnIdle(new nh0(ai0Var, this.f36114c, this.d, this.e, this.f36115f, 1));
                return;
            default:
                ai0.U(this.f36113b, this.f36114c, this.d, this.e, this.f36115f);
                return;
        }
    }
}
