package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe0 implements RequestDelegate {
    public final int f50864a;
    public final ff0 f50865b;

    public pe0(ff0 ff0Var, int i7) {
        this.f50864a = i7;
        this.f50865b = ff0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50864a) {
            case 0:
                org.telegram.messenger.g0.g3(new ue0(this.f50865b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new fe0(1, this.f50865b, tL_error));
                return;
        }
    }
}
