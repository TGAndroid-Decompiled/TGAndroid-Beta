package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements Runnable {
    public final int f34740a;
    public final vh0 f34741b;
    public final TLRPC.TL_error f34742c;
    public final TLObject d;

    public jh0(vh0 vh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f34740a = i10;
        this.f34741b = vh0Var;
        this.f34742c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34740a) {
            case 0:
                vh0 vh0Var = this.f34741b;
                vh0Var.getNotificationCenter().doOnIdle(new jh0(vh0Var, this.f34742c, this.d, 1));
                return;
            default:
                vh0.V(this.f34741b, this.f34742c, this.d);
                return;
        }
    }
}
