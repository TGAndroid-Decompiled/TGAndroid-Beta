package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z5 implements RequestDelegate {
    public final int f21968a;
    public final LocationController f21969b;

    public z5(LocationController locationController, int i10) {
        this.f21968a = i10;
        this.f21969b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21968a) {
            case 0:
                this.f21969b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f21969b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f21969b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
