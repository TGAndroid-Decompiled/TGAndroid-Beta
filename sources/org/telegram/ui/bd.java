package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd implements RequestDelegate {
    public final int f36029a;
    public final kd f36030b;

    public bd(kd kdVar, int i10) {
        this.f36029a = i10;
        this.f36030b = kdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36029a) {
            case 0:
                org.telegram.messenger.i0.g3(new h0(20, this.f36030b, tLObject));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new h0(18, this.f36030b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.i0.g3(new ad(this.f36030b, 3));
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g3(new p1(this.f36030b, tL_error, tLObject, 11));
                return;
        }
    }
}
