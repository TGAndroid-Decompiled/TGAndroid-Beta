package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class ReportBottomSheet$Page$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ReportBottomSheet.Page f$0;

    public ReportBottomSheet$Page$$ExternalSyntheticLambda0(ReportBottomSheet.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.showKeyboard(this.f$0.editTextCell.editText);
                break;
            default:
                ReportBottomSheet.Page page = this.f$0;
                int i = page.pageType;
                ReportBottomSheet reportBottomSheet = ReportBottomSheet.this;
                if (i != 0) {
                    reportBottomSheet.lambda$openCrafting$8();
                } else {
                    reportBottomSheet.lambda$showGiftOfferSheet$15();
                }
                break;
        }
    }
}
