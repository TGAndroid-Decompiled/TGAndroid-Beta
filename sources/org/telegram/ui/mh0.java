package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f35752a;
    public final yh0 f35753b;
    public final TLRPC.TL_error f35754c;
    public final TLObject d;

    public mh0(yh0 yh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35752a = i10;
        this.f35753b = yh0Var;
        this.f35754c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35752a) {
            case 0:
                yh0 yh0Var = this.f35753b;
                yh0Var.getNotificationCenter().doOnIdle(new mh0(yh0Var, this.f35754c, this.d, 1));
                return;
            default:
                yh0.V(this.f35753b, this.f35754c, this.d);
                return;
        }
    }
}
