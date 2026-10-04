package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback2 {
    public final int f19969a;
    public final BaseController f19970b;
    public final Object f19971c;
    public final Object d;
    public final Object f19972e;

    public z3(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f19969a = i10;
        this.f19970b = baseController;
        this.f19971c = obj;
        this.d = obj2;
        this.f19972e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19969a) {
            case 0:
                ((GiftAuctionController) this.f19970b).lambda$sendBid$9((Utilities.Callback2) this.f19971c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f19972e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f19970b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f19971c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f19972e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f19970b).lambda$getStickerSet$38((String) this.f19971c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f19972e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
