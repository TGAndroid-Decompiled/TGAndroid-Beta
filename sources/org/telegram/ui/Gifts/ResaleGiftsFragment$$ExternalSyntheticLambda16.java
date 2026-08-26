package org.telegram.ui.Gifts;

public final class ResaleGiftsFragment$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final ResaleGiftsFragment f$0;

    public ResaleGiftsFragment$$ExternalSyntheticLambda16(ResaleGiftsFragment resaleGiftsFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = resaleGiftsFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = this.f$0.list;
                if (!resaleGiftsList.notSelectedPatternAttributes.isEmpty()) {
                    resaleGiftsList.notSelectedPatternAttributes.clear();
                    resaleGiftsList.reload();
                    break;
                }
                break;
            case 1:
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = this.f$0.list;
                if (!resaleGiftsList2.notSelectedBackdropAttributes.isEmpty()) {
                    resaleGiftsList2.notSelectedBackdropAttributes.clear();
                    resaleGiftsList2.reload();
                    break;
                }
                break;
            case 2:
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = this.f$0.list;
                if (!resaleGiftsList3.notSelectedModelAttributes.isEmpty()) {
                    resaleGiftsList3.notSelectedModelAttributes.clear();
                    resaleGiftsList3.reload();
                    break;
                }
                break;
            case 3:
                ResaleGiftsFragment resaleGiftsFragment = this.f$0;
                resaleGiftsFragment.getClass();
                resaleGiftsFragment.list.setSorting(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_PRICE);
                break;
            case 4:
                ResaleGiftsFragment resaleGiftsFragment2 = this.f$0;
                resaleGiftsFragment2.getClass();
                resaleGiftsFragment2.list.setSorting(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_DATE);
                break;
            default:
                ResaleGiftsFragment resaleGiftsFragment3 = this.f$0;
                resaleGiftsFragment3.getClass();
                resaleGiftsFragment3.list.setSorting(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_NUMBER);
                break;
        }
    }
}
