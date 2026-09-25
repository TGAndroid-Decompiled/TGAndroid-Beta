package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 implements Runnable {
    public final int f33943a;
    public final sh0 f33944b;
    public final TLRPC.TL_error f33945c;
    public final TLObject d;

    public gh0(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f33943a = i10;
        this.f33944b = sh0Var;
        this.f33945c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33943a) {
            case 0:
                sh0 sh0Var = this.f33944b;
                sh0Var.getNotificationCenter().doOnIdle(new gh0(sh0Var, this.f33945c, this.d, 1));
                return;
            default:
                sh0.V(this.f33944b, this.f33945c, this.d);
                return;
        }
    }
}
