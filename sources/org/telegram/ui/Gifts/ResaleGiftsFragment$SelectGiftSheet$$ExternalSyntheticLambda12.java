package org.telegram.ui.Gifts;

public final class ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final ResaleGiftsFragment.SelectGiftSheet.State f$0;

    public ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12(ResaleGiftsFragment.SelectGiftSheet.State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ResaleGiftsFragment.SelectGiftSheet.State state = this.f$0;
                if (!state.resaleList.notSelectedModelAttributes.isEmpty()) {
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = state.resaleList;
                    resaleGiftsList.notSelectedModelAttributes.clear();
                    resaleGiftsList.reload();
                    break;
                }
                break;
            case 1:
                ResaleGiftsFragment.SelectGiftSheet.State state2 = this.f$0;
                if (!state2.resaleList.notSelectedBackdropAttributes.isEmpty()) {
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = state2.resaleList;
                    resaleGiftsList2.notSelectedBackdropAttributes.clear();
                    resaleGiftsList2.reload();
                    break;
                }
                break;
            case 2:
                ResaleGiftsFragment.SelectGiftSheet.State state3 = this.f$0;
                if (!state3.resaleList.notSelectedPatternAttributes.isEmpty()) {
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = state3.resaleList;
                    resaleGiftsList3.notSelectedPatternAttributes.clear();
                    resaleGiftsList3.reload();
                    break;
                }
                break;
            case 3:
                this.f$0.resaleList.setSorting(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_PRICE);
                break;
            case 4:
                this.f$0.resaleList.setSorting(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_DATE);
                break;
            default:
                this.f$0.resaleList.setSorting(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_NUMBER);
                break;
        }
    }
}
