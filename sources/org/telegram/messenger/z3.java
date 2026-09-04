package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback2 {
    public final int f19780a;
    public final BaseController f19781b;
    public final Object f19782c;
    public final Object d;
    public final Object f19783e;

    public z3(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f19780a = i10;
        this.f19781b = baseController;
        this.f19782c = obj;
        this.d = obj2;
        this.f19783e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19780a) {
            case 0:
                ((GiftAuctionController) this.f19781b).lambda$sendBid$9((Utilities.Callback2) this.f19782c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f19783e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f19781b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f19782c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f19783e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f19781b).lambda$getStickerSet$38((String) this.f19782c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f19783e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
