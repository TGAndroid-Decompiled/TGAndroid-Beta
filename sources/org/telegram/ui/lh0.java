package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f35487a;
    public final yh0 f35488b;
    public final TLRPC.TL_chatInviteExported f35489c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f35490f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f35487a = i10;
        this.f35488b = yh0Var;
        this.f35489c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f35490f = z10;
    }

    @Override
    public final void run() {
        switch (this.f35487a) {
            case 0:
                yh0 yh0Var = this.f35488b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f35489c, this.d, this.e, this.f35490f, 1));
                return;
            default:
                yh0.U(this.f35488b, this.f35489c, this.d, this.e, this.f35490f);
                return;
        }
    }
}
