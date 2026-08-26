package org.telegram.ui.Gifts;

import org.telegram.messenger.AndroidUtilities;

public final class ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ResaleGiftsFragment.SelectGiftSheet f$0;

    public ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7(ResaleGiftsFragment.SelectGiftSheet selectGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = selectGiftSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ResaleGiftsFragment.SelectGiftSheet selectGiftSheet = this.f$0;
                selectGiftSheet.adapter.update(true);
                AndroidUtilities.runOnUIThread(new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7(selectGiftSheet, 1), 150L);
                break;
            default:
                this.f$0.onScroll$1();
                break;
        }
    }
}
