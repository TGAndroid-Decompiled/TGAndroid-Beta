package org.telegram.ui;

public final class ChatActivity$$ExternalSyntheticLambda82 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final int f$1;

    public ChatActivity$$ExternalSyntheticLambda82(ChatActivity chatActivity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatActivity;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didLongPressUsername$434(this.f$1);
                break;
            case 1:
                this.f$0.lambda$didPressPhoneNumber$460(this.f$1);
                break;
            case 2:
                this.f$0.lambda$processNewMessages$203(this.f$1);
                break;
            case 3:
                this.f$0.lambda$didLongPressUsername$437(this.f$1);
                break;
            case 4:
                this.f$0.lambda$createView$23(this.f$1);
                break;
            case 5:
                this.f$0.lambda$didLongPressCard$426(this.f$1);
                break;
            case 6:
                this.f$0.lambda$showInfoHint$206(this.f$1);
                break;
            case 7:
                this.f$0.lambda$createView$22(this.f$1);
                break;
            case 8:
                this.f$0.lambda$didReceivedNotification3$174(this.f$1);
                break;
            default:
                this.f$0.lambda$didReceivedNotification7$189(this.f$1);
                break;
        }
    }
}
