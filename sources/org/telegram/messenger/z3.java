package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback2 {
    public final int f19959a;
    public final BaseController f19960b;
    public final Object f19961c;
    public final Object d;
    public final Object f19962e;

    public z3(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f19959a = i10;
        this.f19960b = baseController;
        this.f19961c = obj;
        this.d = obj2;
        this.f19962e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19959a) {
            case 0:
                ((GiftAuctionController) this.f19960b).lambda$sendBid$9((Utilities.Callback2) this.f19961c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f19962e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f19960b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f19961c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f19962e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f19960b).lambda$getStickerSet$38((String) this.f19961c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f19962e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
