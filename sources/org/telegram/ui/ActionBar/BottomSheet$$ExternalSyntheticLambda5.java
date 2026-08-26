package org.telegram.ui.ActionBar;

public final class BottomSheet$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final BottomSheet f$0;

    public BottomSheet$$ExternalSyntheticLambda5(BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCreateInternal$2();
                break;
            case 1:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.lambda$dismiss$10();
                break;
        }
    }
}
