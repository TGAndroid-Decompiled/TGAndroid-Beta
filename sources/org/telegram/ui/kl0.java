package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kl0 implements RequestDelegate {
    public final int f38908a;
    public final qm0 f38909b;

    public kl0(qm0 qm0Var, int i10) {
        this.f38908a = i10;
        this.f38909b = qm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38908a) {
            case 0:
                org.telegram.messenger.i0.g3(new nl0(this.f38909b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new if0(17, this.f38909b, tL_error));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new nl0(this.f38909b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.i0.g3(new rl0(this.f38909b, tL_error, tLObject, 0));
                return;
        }
    }
}
