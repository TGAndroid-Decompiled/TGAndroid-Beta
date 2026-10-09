package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f40212a;
    public final zh0 f40213b;
    public final TLRPC.TL_error f40214c;
    public final TLObject d;

    public nh0(zh0 zh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f40212a = i10;
        this.f40213b = zh0Var;
        this.f40214c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40212a) {
            case 0:
                zh0 zh0Var = this.f40213b;
                zh0Var.getNotificationCenter().doOnIdle(new nh0(zh0Var, this.f40214c, this.d, 1));
                return;
            default:
                zh0.V(this.f40213b, this.f40214c, this.d);
                return;
        }
    }
}
