package org.telegram.ui;

public final class GroupCallActivity$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda28(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openShareAlert$60();
                break;
            case 1:
                this.f$0.lambda$setCommentsEnabled$78();
                break;
            case 2:
                this.f$0.checkInsets();
                break;
            case 3:
                this.f$0.onUserLeaveHint();
                break;
            case 4:
                this.f$0.pressRunnableImpl();
                break;
            case 5:
                this.f$0.openShareConferenceLink();
                break;
            case 6:
                this.f$0.lambda$onUserLeaveHint$80();
                break;
            case 7:
                this.f$0.lambda$processSelectedOption$72();
                break;
            case 8:
                this.f$0.lambda$didReceivedNotification$1();
                break;
            case 9:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.lambda$updateItems$3();
                break;
        }
    }
}
