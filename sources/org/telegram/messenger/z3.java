package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback2 {
    public final int f19974a;
    public final BaseController f19975b;
    public final Object f19976c;
    public final Object d;
    public final Object f19977e;

    public z3(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f19974a = i10;
        this.f19975b = baseController;
        this.f19976c = obj;
        this.d = obj2;
        this.f19977e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19974a) {
            case 0:
                ((GiftAuctionController) this.f19975b).lambda$sendBid$9((Utilities.Callback2) this.f19976c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f19977e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f19975b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f19976c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f19977e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f19975b).lambda$getStickerSet$38((String) this.f19976c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f19977e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
