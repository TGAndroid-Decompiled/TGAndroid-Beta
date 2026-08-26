package org.telegram.ui.Components.Premium;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda1(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = limitReachedBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onViewCreated$13();
                break;
            case 1:
                this.f$0.lambda$showPremiumBlockedToast$15();
                break;
            case 2:
                this.f$0.lambda$sendInviteMessages$20();
                break;
            case 3:
                this.f$0.lambda$new$2();
                break;
            default:
                this.f$0.lambda$new$3();
                break;
        }
    }
}
