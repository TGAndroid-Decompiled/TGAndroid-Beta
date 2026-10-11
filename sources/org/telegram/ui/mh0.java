package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f39946a;
    public final yh0 f39947b;
    public final TLRPC.TL_error f39948c;
    public final TLObject d;

    public mh0(yh0 yh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39946a = i10;
        this.f39947b = yh0Var;
        this.f39948c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f39946a) {
            case 0:
                yh0 yh0Var = this.f39947b;
                yh0Var.getNotificationCenter().doOnIdle(new mh0(yh0Var, this.f39948c, this.d, 1));
                return;
            default:
                yh0.V(this.f39947b, this.f39948c, this.d);
                return;
        }
    }
}
