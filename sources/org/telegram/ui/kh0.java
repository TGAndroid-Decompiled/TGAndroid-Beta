package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh0 implements Runnable {
    public final int f38010a;
    public final wh0 f38011b;
    public final TLRPC.TL_error f38012c;
    public final TLObject d;

    public kh0(wh0 wh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f38010a = i10;
        this.f38011b = wh0Var;
        this.f38012c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f38010a) {
            case 0:
                wh0 wh0Var = this.f38011b;
                wh0Var.getNotificationCenter().doOnIdle(new kh0(wh0Var, this.f38012c, this.d, 1));
                return;
            default:
                wh0.T(this.f38011b, this.f38012c, this.d);
                return;
        }
    }
}
