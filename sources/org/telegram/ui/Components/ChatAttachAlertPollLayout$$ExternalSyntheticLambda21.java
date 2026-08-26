package org.telegram.ui.Components;

public final class ChatAttachAlertPollLayout$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertPollLayout f$0;
    public final int f$1;

    public ChatAttachAlertPollLayout$$ExternalSyntheticLambda21(ChatAttachAlertPollLayout chatAttachAlertPollLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatAttachAlertPollLayout;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openEditOrReplaceMenu$18(this.f$1);
                break;
            case 1:
                this.f$0.lambda$showOptionsForDrawable$19(this.f$1);
                break;
            default:
                this.f$0.lambda$showOptionsForDrawable$20(this.f$1);
                break;
        }
    }
}
