package org.telegram.ui;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;

    public ChatEditTypeActivity$$ExternalSyntheticLambda2(ChatEditTypeActivity chatEditTypeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadAdminedChannels$17();
                break;
            case 1:
                this.f$0.lambda$new$6();
                break;
            case 2:
                this.f$0.lambda$showPremiumIncreaseLimitDialog$8();
                break;
            case 3:
                this.f$0.lambda$trySetUsername$12();
                break;
            case 4:
                this.f$0.lambda$trySetUsername$13();
                break;
            default:
                this.f$0.processDone();
                break;
        }
    }
}
