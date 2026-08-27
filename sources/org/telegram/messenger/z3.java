package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

public final class z3 implements Utilities.Callback2 {

    public final int f22293a = 0;

    public final GiftAuctionController f22294b;

    public final GiftAuctionController.AuctionInternal f22295c;
    public final Object d;

    public z3(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f22294b = giftAuctionController;
        this.f22295c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22293a) {
            case 0:
                this.f22294b.lambda$sendBid$8(this.f22295c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f22294b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f22295c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public z3(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f22294b = giftAuctionController;
        this.d = callback;
        this.f22295c = auctionInternal;
    }
}
