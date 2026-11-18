package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements RequestDelegate {
    public final int f48745a;
    public final ml0 f48746b;

    public ik0(ml0 ml0Var, int i7) {
        this.f48745a = i7;
        this.f48746b = ml0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48745a) {
            case 0:
                org.telegram.messenger.g0.g3(new lk0(this.f48746b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new we0(15, this.f48746b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new lk0(this.f48746b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.g3(new qk0(this.f48746b, tL_error, tLObject, 0));
                return;
        }
    }
}
