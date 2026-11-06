package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck0 implements RequestDelegate {
    public final int f44824a;
    public final hl0 f44825b;

    public ck0(hl0 hl0Var, int i7) {
        this.f44824a = i7;
        this.f44825b = hl0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44824a) {
            case 0:
                org.telegram.messenger.g0.h3(new gk0(this.f44825b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new zc0(24, this.f44825b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new gk0(this.f44825b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.h3(new kk0(this.f44825b, tL_error, tLObject, 0));
                return;
        }
    }
}
