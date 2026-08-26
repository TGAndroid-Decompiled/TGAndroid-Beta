package org.telegram.ui.Components;

public final class ChatAttachAlertPollLayout$$ExternalSyntheticLambda24 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertPollLayout f$0;
    public final int f$1;

    public ChatAttachAlertPollLayout$$ExternalSyntheticLambda24(ChatAttachAlertPollLayout chatAttachAlertPollLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatAttachAlertPollLayout;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setAttachedMedia(this.f$1, null);
                break;
            case 1:
                this.f$0.openAttachMenuForOptions(this.f$1);
                break;
            default:
                this.f$0.setAttachedMedia(this.f$1, null);
                break;
        }
    }
}
