package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f35750a;
    public final yh0 f35751b;
    public final TLRPC.TL_error f35752c;
    public final TLObject d;

    public mh0(yh0 yh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35750a = i10;
        this.f35751b = yh0Var;
        this.f35752c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35750a) {
            case 0:
                yh0 yh0Var = this.f35751b;
                yh0Var.getNotificationCenter().doOnIdle(new mh0(yh0Var, this.f35752c, this.d, 1));
                return;
            default:
                yh0.V(this.f35751b, this.f35752c, this.d);
                return;
        }
    }
}
