package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements Runnable {
    public final int f38738a;
    public final yh0 f38739b;
    public final TLRPC.TL_error f38740c;
    public final TLObject d;

    public mh0(yh0 yh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f38738a = i10;
        this.f38739b = yh0Var;
        this.f38740c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f38738a) {
            case 0:
                yh0 yh0Var = this.f38739b;
                yh0Var.getNotificationCenter().doOnIdle(new mh0(yh0Var, this.f38740c, this.d, 1));
                return;
            default:
                yh0.V(this.f38739b, this.f38740c, this.d);
                return;
        }
    }
}
