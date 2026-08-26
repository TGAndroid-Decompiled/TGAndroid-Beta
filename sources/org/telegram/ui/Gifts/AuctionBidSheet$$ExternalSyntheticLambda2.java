package org.telegram.ui.Gifts;

import android.view.View;

public final class AuctionBidSheet$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final AuctionBidSheet f$0;

    public AuctionBidSheet$$ExternalSyntheticLambda2(AuctionBidSheet auctionBidSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = auctionBidSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AuctionBidSheet auctionBidSheet = this.f$0;
                auctionBidSheet.slider.setValueAnimated((int) auctionBidSheet.auction.getMinimumBid());
                break;
            case 1:
                this.f$0.lambda$updateButtonText$8(view);
                break;
            default:
                this.f$0.lambda$updateButtonText$9();
                break;
        }
    }
}
