package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fh0 implements Runnable {
    public final int f34081a;
    public final rh0 f34082b;
    public final TLRPC.TL_error f34083c;
    public final TLObject d;

    public fh0(rh0 rh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f34081a = i10;
        this.f34082b = rh0Var;
        this.f34083c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34081a) {
            case 0:
                rh0 rh0Var = this.f34082b;
                rh0Var.getNotificationCenter().doOnIdle(new fh0(rh0Var, this.f34083c, this.d, 1));
                return;
            default:
                rh0.V(this.f34082b, this.f34083c, this.d);
                return;
        }
    }
}
