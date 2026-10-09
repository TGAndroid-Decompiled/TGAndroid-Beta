package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f40210a;
    public final zh0 f40211b;
    public final TLRPC.TL_error f40212c;
    public final TLObject d;

    public nh0(zh0 zh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f40210a = i10;
        this.f40211b = zh0Var;
        this.f40212c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40210a) {
            case 0:
                zh0 zh0Var = this.f40211b;
                zh0Var.getNotificationCenter().doOnIdle(new nh0(zh0Var, this.f40212c, this.d, 1));
                return;
            default:
                zh0.V(this.f40211b, this.f40212c, this.d);
                return;
        }
    }
}
