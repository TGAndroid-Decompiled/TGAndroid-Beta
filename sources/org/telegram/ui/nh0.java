package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f35942a;
    public final zh0 f35943b;
    public final TLRPC.TL_error f35944c;
    public final TLObject d;

    public nh0(zh0 zh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35942a = i10;
        this.f35943b = zh0Var;
        this.f35944c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35942a) {
            case 0:
                zh0 zh0Var = this.f35943b;
                zh0Var.getNotificationCenter().doOnIdle(new nh0(zh0Var, this.f35944c, this.d, 1));
                return;
            default:
                zh0.V(this.f35943b, this.f35944c, this.d);
                return;
        }
    }
}
