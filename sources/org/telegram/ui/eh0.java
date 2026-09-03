package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eh0 implements Runnable {
    public final int f36496a;
    public final qh0 f36497b;
    public final TLRPC.TL_error f36498c;
    public final TLObject d;

    public eh0(qh0 qh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36496a = i10;
        this.f36497b = qh0Var;
        this.f36498c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36496a) {
            case 0:
                qh0 qh0Var = this.f36497b;
                qh0Var.getNotificationCenter().doOnIdle(new eh0(qh0Var, this.f36498c, this.d, 1));
                return;
            default:
                qh0.V(this.f36497b, this.f36498c, this.d);
                return;
        }
    }
}
