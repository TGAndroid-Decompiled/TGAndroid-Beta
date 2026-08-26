package org.telegram.ui.Components;

public final class ChatAttachAlert$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;
    public final boolean f$1;

    public ChatAttachAlert$$ExternalSyntheticLambda8(ChatAttachAlert chatAttachAlert, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateMotionItem$63(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setTypeButtonsHidden$66(this.f$1);
                break;
            case 2:
                this.f$0.lambda$showAiButton$67(this.f$1);
                break;
            default:
                this.f$0.lambda$showAiButton$68(this.f$1);
                break;
        }
    }
}
