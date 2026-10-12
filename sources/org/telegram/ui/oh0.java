package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh0 implements Runnable {
    public final int f40717a;
    public final ai0 f40718b;
    public final TLRPC.TL_error f40719c;
    public final TLObject d;

    public oh0(ai0 ai0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f40717a = i10;
        this.f40718b = ai0Var;
        this.f40719c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40717a) {
            case 0:
                ai0 ai0Var = this.f40718b;
                ai0Var.getNotificationCenter().doOnIdle(new oh0(ai0Var, this.f40719c, this.d, 1));
                return;
            default:
                ai0.V(this.f40718b, this.f40719c, this.d);
                return;
        }
    }
}
