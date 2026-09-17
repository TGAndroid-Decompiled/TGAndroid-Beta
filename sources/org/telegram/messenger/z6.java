package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f19836a;
    public final MediaDataController f19837b;
    public final String f19838c;

    public z6(MediaDataController mediaDataController, String str, int i10) {
        this.f19836a = i10;
        this.f19837b = mediaDataController;
        this.f19838c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19836a) {
            case 0:
                this.f19837b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19838c, tLObject, tL_error);
                return;
            default:
                this.f19837b.lambda$fetchStickerSetInternal$42(this.f19838c, tLObject, tL_error);
                return;
        }
    }
}
