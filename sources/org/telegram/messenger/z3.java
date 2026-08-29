package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class z3 implements Utilities.Callback2 {
    public final int f22304a = 0;
    public final GiftAuctionController f22305b;
    public final GiftAuctionController.AuctionInternal f22306c;
    public final Object d;

    public z3(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f22305b = giftAuctionController;
        this.f22306c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22304a) {
            case 0:
                this.f22305b.lambda$sendBid$8(this.f22306c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f22305b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f22306c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public z3(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f22305b = giftAuctionController;
        this.d = callback;
        this.f22306c = auctionInternal;
    }
}
