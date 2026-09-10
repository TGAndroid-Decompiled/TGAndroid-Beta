package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f35275a;
    public final zh0 f35276b;
    public final TLRPC.TL_error f35277c;
    public final TLObject d;

    public nh0(zh0 zh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35275a = i10;
        this.f35276b = zh0Var;
        this.f35277c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35275a) {
            case 0:
                zh0 zh0Var = this.f35276b;
                zh0Var.getNotificationCenter().doOnIdle(new nh0(zh0Var, this.f35277c, this.d, 1));
                return;
            default:
                zh0.V(this.f35276b, this.f35277c, this.d);
                return;
        }
    }
}
