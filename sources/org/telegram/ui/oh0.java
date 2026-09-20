package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh0 implements Runnable {
    public final int f36312a;
    public final ai0 f36313b;
    public final TLRPC.TL_error f36314c;
    public final TLObject d;

    public oh0(ai0 ai0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36312a = i10;
        this.f36313b = ai0Var;
        this.f36314c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36312a) {
            case 0:
                ai0 ai0Var = this.f36313b;
                ai0Var.getNotificationCenter().doOnIdle(new oh0(ai0Var, this.f36314c, this.d, 1));
                return;
            default:
                ai0.V(this.f36313b, this.f36314c, this.d);
                return;
        }
    }
}
