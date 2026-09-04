package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f38710a;
    public final yh0 f38711b;
    public final TLRPC.TL_error f38712c;
    public final TLObject d;

    public mh0(yh0 yh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f38710a = i10;
        this.f38711b = yh0Var;
        this.f38712c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f38710a) {
            case 0:
                yh0 yh0Var = this.f38711b;
                yh0Var.getNotificationCenter().doOnIdle(new mh0(yh0Var, this.f38712c, this.d, 1));
                return;
            default:
                yh0.V(this.f38711b, this.f38712c, this.d);
                return;
        }
    }
}
