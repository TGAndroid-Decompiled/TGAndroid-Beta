package org.telegram.ui;

public final class DialogsActivity$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda12(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkEmailConfig$158();
                break;
            case 1:
                DialogsActivity.access$23100(this.f$0);
                break;
            case 2:
                this.f$0.lambda$updateDialogsHint$57();
                break;
            case 3:
                this.f$0.lambda$updateDialogsHint$41();
                break;
            case 4:
                this.f$0.lambda$onRequestPermissionsResultFragment$119();
                break;
            case 5:
                this.f$0.lambda$showArchiveHelp$87();
                break;
            case 6:
                this.f$0.lambda$updateDialogsHint$49();
                break;
            case 7:
                this.f$0.lambda$onGetDebugItems$146();
                break;
            case 8:
                this.f$0.lambda$onGetDebugItems$147();
                break;
            case 9:
                this.f$0.lambda$setStoriesOvercroll$29();
                break;
            case 10:
                this.f$0.lambda$onSendLongClick$141();
                break;
            case 11:
                this.f$0.lambda$onSendLongClick$142(false);
                break;
            case 12:
                this.f$0.lambda$checkEmailConfig$159();
                break;
            case 13:
                this.f$0.createSearchViewPager();
                break;
            case 14:
                this.f$0.lambda$showFiltersHint$124();
                break;
            case 15:
                this.f$0.lambda$updateDialogsHint$41();
                break;
            case 16:
                this.f$0.lambda$updateDialogsHint$55();
                break;
            case 17:
                this.f$0.lambda$showItemOptions$164();
                break;
            case 18:
                this.f$0.lambda$showPremiumBlockedToast$33();
                break;
            case 19:
                this.f$0.lambda$createView$21();
                break;
            case 20:
                this.f$0.lambda$createView$22();
                break;
            case 21:
                this.f$0.lambda$createView$9();
                break;
            case 22:
                this.f$0.lambda$createView$13();
                break;
            case 23:
                this.f$0.lambda$openStoriesRecorder$157();
                break;
            case 24:
                this.f$0.lambda$setDialogsListFrozen$126();
                break;
            case 25:
                this.f$0.checkInsets();
                break;
            case 26:
                this.f$0.lambda$showFiltersHint$125();
                break;
            case 27:
                this.f$0.lambda$updateDialogsHint$59();
                break;
            case 28:
                this.f$0.lambda$openSetAvatar$155();
                break;
            default:
                this.f$0.lambda$updateDialogsHint$51();
                break;
        }
    }
}
