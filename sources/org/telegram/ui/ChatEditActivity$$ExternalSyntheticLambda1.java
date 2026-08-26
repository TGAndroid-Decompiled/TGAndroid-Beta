package org.telegram.ui;

public final class ChatEditActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatEditActivity f$0;

    public ChatEditActivity$$ExternalSyntheticLambda1(ChatEditActivity chatEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didUploadPhoto$57();
                break;
            case 1:
                this.f$0.lambda$openSetPhotoAlert$53();
                break;
            case 2:
                this.f$0.lambda$processDone$64();
                break;
            case 3:
                this.f$0.lambda$createView$17();
                break;
            default:
                this.f$0.lambda$openSetPhotoAlert$55();
                break;
        }
    }
}
