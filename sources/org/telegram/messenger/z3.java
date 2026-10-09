package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class z3 implements Utilities.Callback2 {
    public final int f19956a = 0;
    public final GiftAuctionController f19957b;
    public final GiftAuctionController.AuctionInternal f19958c;
    public final Object d;

    public z3(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f19957b = giftAuctionController;
        this.f19958c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19956a) {
            case 0:
                this.f19957b.lambda$sendBid$8(this.f19958c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19957b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f19958c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public z3(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f19957b = giftAuctionController;
        this.d = callback;
        this.f19958c = auctionInternal;
    }
}
