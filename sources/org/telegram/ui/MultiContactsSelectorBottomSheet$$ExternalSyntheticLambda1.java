package org.telegram.ui;

public final class MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final MultiContactsSelectorBottomSheet f$0;

    public MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda1(MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = multiContactsSelectorBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                this.f$0.updateList$2(true, false);
                break;
            default:
                this.f$0.updateList$2(true, false);
                break;
        }
    }
}
