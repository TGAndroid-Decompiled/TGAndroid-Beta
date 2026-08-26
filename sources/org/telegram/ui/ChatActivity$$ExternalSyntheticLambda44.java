package org.telegram.ui;

public final class ChatActivity$$ExternalSyntheticLambda44 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final boolean f$1;

    public ChatActivity$$ExternalSyntheticLambda44(int i, ChatActivity chatActivity, boolean z) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateMessagesVisiblePart$158(this.f$1);
                break;
            case 1:
                this.f$0.lambda$showPremiumFloodWaitBulletin$408(this.f$1);
                break;
            default:
                this.f$0.lambda$showSearchShowOther$107(this.f$1);
                break;
        }
    }
}
