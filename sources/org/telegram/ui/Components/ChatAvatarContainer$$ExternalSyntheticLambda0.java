package org.telegram.ui.Components;

public final class ChatAvatarContainer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatAvatarContainer f$0;

    public ChatAvatarContainer$$ExternalSyntheticLambda0(ChatAvatarContainer chatAvatarContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAvatarContainer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fadeOutToLessWidth$4();
                break;
            case 1:
                this.f$0.lambda$fadeOutToLessWidth$5();
                break;
            default:
                this.f$0.lambda$new$3();
                break;
        }
    }
}
