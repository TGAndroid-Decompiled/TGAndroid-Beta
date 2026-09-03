package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dh0 implements Runnable {
    public final int f36193a;
    public final qh0 f36194b;
    public final TLRPC.TL_chatInviteExported f36195c;
    public final TLRPC.TL_error d;
    public final TLObject f36196e;
    public final boolean f36197f;

    public dh0(qh0 qh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, int i10) {
        this.f36193a = i10;
        this.f36194b = qh0Var;
        this.f36195c = tL_chatInviteExported;
        this.d = tL_error;
        this.f36196e = tLObject;
        this.f36197f = z4;
    }

    @Override
    public final void run() {
        switch (this.f36193a) {
            case 0:
                qh0 qh0Var = this.f36194b;
                qh0Var.getNotificationCenter().doOnIdle(new dh0(qh0Var, this.f36195c, this.d, this.f36196e, this.f36197f, 1));
                return;
            default:
                qh0.U(this.f36194b, this.f36195c, this.d, this.f36196e, this.f36197f);
                return;
        }
    }
}
