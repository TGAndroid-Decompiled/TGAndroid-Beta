package org.telegram.ui.Components;

public final class ChatAttachAlertContactsLayout$UserCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertContactsLayout.UserCell f$0;

    public ChatAttachAlertContactsLayout$UserCell$$ExternalSyntheticLambda0(ChatAttachAlertContactsLayout.UserCell userCell, int i) {
        this.$r8$classId = i;
        this.f$0 = userCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setStatus$2();
                break;
            default:
                this.f$0.lambda$setStatus$3();
                break;
        }
    }
}
