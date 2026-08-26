package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda12 implements MessagesStorage.LongCallback {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;

    public ChatEditTypeActivity$$ExternalSyntheticLambda12(ChatEditTypeActivity chatEditTypeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
    }

    @Override
    public final void run(long j) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$tryUpdateJoinSettings$9(j);
                break;
            case 1:
                this.f$0.lambda$trySetUsername$11(j);
                break;
            default:
                this.f$0.lambda$trySetRestrict$10(j);
                break;
        }
    }
}
