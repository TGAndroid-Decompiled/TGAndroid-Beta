package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f35506a;
    public final yh0 f35507b;
    public final TLRPC.TL_chatInviteExported f35508c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f35509f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f35506a = i10;
        this.f35507b = yh0Var;
        this.f35508c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f35509f = z10;
    }

    @Override
    public final void run() {
        switch (this.f35506a) {
            case 0:
                yh0 yh0Var = this.f35507b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f35508c, this.d, this.e, this.f35509f, 1));
                return;
            default:
                yh0.U(this.f35507b, this.f35508c, this.d, this.e, this.f35509f);
                return;
        }
    }
}
