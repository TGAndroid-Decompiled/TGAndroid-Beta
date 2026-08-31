package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dh0 implements Runnable {
    public final int f36227a;
    public final qh0 f36228b;
    public final TLRPC.TL_chatInviteExported f36229c;
    public final TLRPC.TL_error d;
    public final TLObject f36230e;
    public final boolean f36231f;

    public dh0(qh0 qh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, int i10) {
        this.f36227a = i10;
        this.f36228b = qh0Var;
        this.f36229c = tL_chatInviteExported;
        this.d = tL_error;
        this.f36230e = tLObject;
        this.f36231f = z4;
    }

    @Override
    public final void run() {
        switch (this.f36227a) {
            case 0:
                qh0 qh0Var = this.f36228b;
                qh0Var.getNotificationCenter().doOnIdle(new dh0(qh0Var, this.f36229c, this.d, this.f36230e, this.f36231f, 1));
                return;
            default:
                qh0.U(this.f36228b, this.f36229c, this.d, this.f36230e, this.f36231f);
                return;
        }
    }
}
