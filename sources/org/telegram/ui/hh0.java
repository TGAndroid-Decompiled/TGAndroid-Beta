package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh0 implements Runnable {
    public final int f33855a;
    public final th0 f33856b;
    public final TLRPC.TL_error f33857c;
    public final TLObject d;

    public hh0(th0 th0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f33855a = i10;
        this.f33856b = th0Var;
        this.f33857c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33855a) {
            case 0:
                th0 th0Var = this.f33856b;
                th0Var.getNotificationCenter().doOnIdle(new hh0(th0Var, this.f33857c, this.d, 1));
                return;
            default:
                th0.V(this.f33856b, this.f33857c, this.d);
                return;
        }
    }
}
