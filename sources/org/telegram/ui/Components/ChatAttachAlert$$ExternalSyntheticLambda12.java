package org.telegram.ui.Components;

public final class ChatAttachAlert$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda12(ChatAttachAlert chatAttachAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.removeFromRoot();
                break;
            case 1:
                this.f$0.lambda$showLayout$50();
                break;
            case 2:
                this.f$0.lambda$new$34();
                break;
            default:
                this.f$0.lambda$setCaptionAbove$77();
                break;
        }
    }
}
