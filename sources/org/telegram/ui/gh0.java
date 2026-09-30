package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 implements Runnable {
    public final int f34083a;
    public final sh0 f34084b;
    public final TLRPC.TL_error f34085c;
    public final TLObject d;

    public gh0(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f34083a = i10;
        this.f34084b = sh0Var;
        this.f34085c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34083a) {
            case 0:
                sh0 sh0Var = this.f34084b;
                sh0Var.getNotificationCenter().doOnIdle(new gh0(sh0Var, this.f34085c, this.d, 1));
                return;
            default:
                sh0.V(this.f34084b, this.f34085c, this.d);
                return;
        }
    }
}
