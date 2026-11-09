package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek0 implements RequestDelegate {
    public final int f45458a;
    public final jl0 f45459b;

    public ek0(jl0 jl0Var, int i7) {
        this.f45458a = i7;
        this.f45459b = jl0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45458a) {
            case 0:
                org.telegram.messenger.g0.h3(new ik0(this.f45459b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new bd0(24, this.f45459b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ik0(this.f45459b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.h3(new mk0(this.f45459b, tL_error, tLObject, 0));
                return;
        }
    }
}
