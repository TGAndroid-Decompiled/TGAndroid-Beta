package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh0 implements Runnable {
    public final int f40719a;
    public final ai0 f40720b;
    public final TLRPC.TL_error f40721c;
    public final TLObject d;

    public oh0(ai0 ai0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f40719a = i10;
        this.f40720b = ai0Var;
        this.f40721c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40719a) {
            case 0:
                ai0 ai0Var = this.f40720b;
                ai0Var.getNotificationCenter().doOnIdle(new oh0(ai0Var, this.f40721c, this.d, 1));
                return;
            default:
                ai0.V(this.f40720b, this.f40721c, this.d);
                return;
        }
    }
}
