package org.telegram.ui;

public final class ChatActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final long f$1;

    public ChatActivity$$ExternalSyntheticLambda6(ChatActivity chatActivity, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$migrateToNewChat$205(this.f$1);
                break;
            case 1:
                this.f$0.lambda$performHistoryClear$126(this.f$1);
                break;
            case 2:
                this.f$0.lambda$didLongPressUsername$427(this.f$1);
                break;
            case 3:
                this.f$0.lambda$didLongPressUsername$430(this.f$1);
                break;
            case 4:
                this.f$0.lambda$didLongPressFormattedDate$419(this.f$1);
                break;
            default:
                this.f$0.lambda$onFragmentCreate$14(this.f$1);
                break;
        }
    }
}
