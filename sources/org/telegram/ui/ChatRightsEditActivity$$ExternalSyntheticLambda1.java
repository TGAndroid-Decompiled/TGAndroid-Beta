package org.telegram.ui;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatRightsEditActivity f$0;
    public final long f$1;

    public ChatRightsEditActivity$$ExternalSyntheticLambda1(ChatRightsEditActivity chatRightsEditActivity, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = chatRightsEditActivity;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$6(this.f$1);
                break;
            default:
                this.f$0.lambda$createView$7(this.f$1);
                break;
        }
    }
}
