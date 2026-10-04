package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh0 implements Runnable {
    public final int f37979a;
    public final wh0 f37980b;
    public final TLRPC.TL_error f37981c;
    public final TLObject d;

    public kh0(wh0 wh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37979a = i10;
        this.f37980b = wh0Var;
        this.f37981c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37979a) {
            case 0:
                wh0 wh0Var = this.f37980b;
                wh0Var.getNotificationCenter().doOnIdle(new kh0(wh0Var, this.f37981c, this.d, 1));
                return;
            default:
                wh0.T(this.f37980b, this.f37981c, this.d);
                return;
        }
    }
}
