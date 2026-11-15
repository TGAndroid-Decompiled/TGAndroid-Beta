package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk0 implements RequestDelegate {
    public final int f47137a;
    public final kl0 f47138b;

    public fk0(kl0 kl0Var, int i7) {
        this.f47137a = i7;
        this.f47138b = kl0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47137a) {
            case 0:
                org.telegram.messenger.g0.h3(new ik0(this.f47138b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new jd0(20, this.f47138b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ik0(this.f47138b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.h3(new nk0(this.f47138b, tL_error, tLObject, 0));
                return;
        }
    }
}
