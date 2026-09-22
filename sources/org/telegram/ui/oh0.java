package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh0 implements Runnable {
    public final int f36330a;
    public final ai0 f36331b;
    public final TLRPC.TL_error f36332c;
    public final TLObject d;

    public oh0(ai0 ai0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36330a = i10;
        this.f36331b = ai0Var;
        this.f36332c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36330a) {
            case 0:
                ai0 ai0Var = this.f36331b;
                ai0Var.getNotificationCenter().doOnIdle(new oh0(ai0Var, this.f36332c, this.d, 1));
                return;
            default:
                ai0.V(this.f36331b, this.f36332c, this.d);
                return;
        }
    }
}
