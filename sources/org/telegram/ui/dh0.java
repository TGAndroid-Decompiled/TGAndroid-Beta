package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dh0 implements Runnable {
    public final int f33640a;
    public final ph0 f33641b;
    public final TLRPC.TL_error f33642c;
    public final TLObject d;

    public dh0(ph0 ph0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f33640a = i10;
        this.f33641b = ph0Var;
        this.f33642c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33640a) {
            case 0:
                ph0 ph0Var = this.f33641b;
                ph0Var.getNotificationCenter().doOnIdle(new dh0(ph0Var, this.f33642c, this.d, 1));
                return;
            default:
                ph0.V(this.f33641b, this.f33642c, this.d);
                return;
        }
    }
}
