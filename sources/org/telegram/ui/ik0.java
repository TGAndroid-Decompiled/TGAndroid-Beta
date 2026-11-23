package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements RequestDelegate {
    public final int f48753a;
    public final ml0 f48754b;

    public ik0(ml0 ml0Var, int i7) {
        this.f48753a = i7;
        this.f48754b = ml0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48753a) {
            case 0:
                org.telegram.messenger.g0.g3(new lk0(this.f48754b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ve0(15, this.f48754b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new lk0(this.f48754b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.g3(new qk0(this.f48754b, tL_error, tLObject, 0));
                return;
        }
    }
}
