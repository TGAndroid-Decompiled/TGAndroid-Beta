package org.telegram.ui.Gifts;

public final class AuctionJoinSheet$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final AuctionJoinSheet f$0;

    public AuctionJoinSheet$$ExternalSyntheticLambda11(AuctionJoinSheet auctionJoinSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = auctionJoinSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openCrafting$8();
                break;
            default:
                this.f$0.showAveragePriceHint();
                break;
        }
    }
}
