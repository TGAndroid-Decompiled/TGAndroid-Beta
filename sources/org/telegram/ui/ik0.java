package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements RequestDelegate {
    public final int f48771a;
    public final ml0 f48772b;

    public ik0(ml0 ml0Var, int i7) {
        this.f48771a = i7;
        this.f48772b = ml0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48771a) {
            case 0:
                org.telegram.messenger.g0.g3(new lk0(this.f48772b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new fe0(17, this.f48772b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new lk0(this.f48772b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.g3(new qk0(this.f48772b, tL_error, tLObject, 0));
                return;
        }
    }
}
