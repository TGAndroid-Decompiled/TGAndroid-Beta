package org.telegram.ui.Components.Premium.boosts;

public final class BoostPagerBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BoostPagerBottomSheet f$0;

    public BoostPagerBottomSheet$$ExternalSyntheticLambda0(BoostPagerBottomSheet boostPagerBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = boostPagerBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.lambda$openCrafting$8();
                break;
        }
    }
}
