package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback2 {
    public final int f18215a;
    public final BaseController f18216b;
    public final Object f18217c;
    public final Object d;
    public final Object e;

    public z3(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f18215a = i10;
        this.f18216b = baseController;
        this.f18217c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18215a) {
            case 0:
                ((GiftAuctionController) this.f18216b).lambda$sendBid$9((Utilities.Callback2) this.f18217c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f18216b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f18217c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f18216b).lambda$getStickerSet$38((String) this.f18217c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
