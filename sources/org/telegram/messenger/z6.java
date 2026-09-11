package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f19809a;
    public final MediaDataController f19810b;
    public final String f19811c;

    public z6(MediaDataController mediaDataController, String str, int i10) {
        this.f19809a = i10;
        this.f19810b = mediaDataController;
        this.f19811c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19809a) {
            case 0:
                this.f19810b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19811c, tLObject, tL_error);
                return;
            default:
                this.f19810b.lambda$fetchStickerSetInternal$42(this.f19811c, tLObject, tL_error);
                return;
        }
    }
}
