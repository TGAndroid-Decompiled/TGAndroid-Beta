package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 implements Runnable {
    public final int f33927a;
    public final sh0 f33928b;
    public final TLRPC.TL_error f33929c;
    public final TLObject d;

    public gh0(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f33927a = i10;
        this.f33928b = sh0Var;
        this.f33929c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33927a) {
            case 0:
                sh0 sh0Var = this.f33928b;
                sh0Var.getNotificationCenter().doOnIdle(new gh0(sh0Var, this.f33929c, this.d, 1));
                return;
            default:
                sh0.V(this.f33928b, this.f33929c, this.d);
                return;
        }
    }
}
