package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk0 implements RequestDelegate {
    public final int f45788a;
    public final kl0 f45789b;

    public fk0(kl0 kl0Var, int i7) {
        this.f45788a = i7;
        this.f45789b = kl0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45788a) {
            case 0:
                org.telegram.messenger.g0.h3(new jk0(this.f45789b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new tc0(25, this.f45789b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new jk0(this.f45789b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.h3(new nk0(this.f45789b, tL_error, tLObject, 0));
                return;
        }
    }
}
