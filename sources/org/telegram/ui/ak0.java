package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ak0 implements RequestDelegate {
    public final int f35800a;
    public final jl0 f35801b;

    public ak0(jl0 jl0Var, int i10) {
        this.f35800a = i10;
        this.f35801b = jl0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35800a) {
            case 0:
                org.telegram.messenger.i0.g3(new pd0(this.f35801b, tL_error, tLObject, false, 13));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new if0(14, this.f35801b, tL_error));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new vj0(this.f35801b, 5));
                return;
            default:
                org.telegram.messenger.i0.g3(new if0(13, this.f35801b, tLObject));
                return;
        }
    }
}
