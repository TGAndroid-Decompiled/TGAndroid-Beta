package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yy implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f27851a;
    public final zy f27852b;

    public yy(zy zyVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f27852b = zyVar;
        this.f27851a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new bm(this, tL_error, this.f27851a, tLObject, 26));
    }
}
