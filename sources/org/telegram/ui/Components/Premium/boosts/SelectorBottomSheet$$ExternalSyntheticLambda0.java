package org.telegram.ui.Components.Premium.boosts;

public final class SelectorBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SelectorBottomSheet f$0;

    public SelectorBottomSheet$$ExternalSyntheticLambda0(SelectorBottomSheet selectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = selectorBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.save(true);
                break;
            case 1:
                this.f$0.updateList$1(true, false);
                break;
            case 2:
                this.f$0.clearSearchAfterSelectChannel();
                break;
            case 3:
                this.f$0.updateList$1(true, false);
                break;
            case 4:
                this.f$0.updateList$1(true, false);
                break;
            case 5:
                this.f$0.updateList$1(true, false);
                break;
            case 6:
                SelectorBottomSheet selectorBottomSheet = this.f$0;
                selectorBottomSheet.selectedIds.clear();
                selectorBottomSheet.openedIds.clear();
                BoostPagerBottomSheet$$ExternalSyntheticLambda0 boostPagerBottomSheet$$ExternalSyntheticLambda0 = selectorBottomSheet.onCloseClick;
                if (boostPagerBottomSheet$$ExternalSyntheticLambda0 != null) {
                    boostPagerBottomSheet$$ExternalSyntheticLambda0.run();
                }
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
