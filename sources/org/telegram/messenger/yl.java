package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yl implements RequestDelegate {
    public final int f19697a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19698b;
    public final Utilities.Callback f19699c;

    public yl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19697a = i10;
        this.f19698b = unconfirmedAuth;
        this.f19699c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19697a) {
            case 0:
                this.f19698b.lambda$deny$4(this.f19699c, tLObject, tL_error);
                return;
            case 1:
                this.f19698b.lambda$deny$6(this.f19699c, tLObject, tL_error);
                return;
            default:
                this.f19698b.lambda$confirm$2(this.f19699c, tLObject, tL_error);
                return;
        }
    }
}
