package org.telegram.ui;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ChatRightsEditActivity f$0;

    public ChatRightsEditActivity$$ExternalSyntheticLambda4(ChatRightsEditActivity chatRightsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatRightsEditActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDonePressed$25();
                break;
            case 1:
                this.f$0.lambda$onDonePressed$22();
                break;
            default:
                this.f$0.lambda$onDonePressed$23();
                break;
        }
    }
}
