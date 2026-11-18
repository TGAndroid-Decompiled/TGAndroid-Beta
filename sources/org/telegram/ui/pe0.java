package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe0 implements RequestDelegate {
    public final int f50824a;
    public final gf0 f50825b;

    public pe0(gf0 gf0Var, int i7) {
        this.f50824a = i7;
        this.f50825b = gf0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50824a) {
            case 0:
                org.telegram.messenger.g0.g3(new ue0(this.f50825b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new o60(29, this.f50825b, tL_error));
                return;
        }
    }
}
