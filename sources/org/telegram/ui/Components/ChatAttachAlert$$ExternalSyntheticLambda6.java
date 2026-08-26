package org.telegram.ui.Components;

public final class ChatAttachAlert$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;
    public final boolean f$1;

    public ChatAttachAlert$$ExternalSyntheticLambda6(ChatAttachAlert chatAttachAlert, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlert chatAttachAlert = this.f$0;
                if (!this.f$1) {
                    chatAttachAlert.motionItem.setVisibility(8);
                } else {
                    chatAttachAlert.getClass();
                }
                break;
            case 1:
                ChatAttachAlert chatAttachAlert2 = this.f$0;
                if (!this.f$1) {
                    chatAttachAlert2.aiButton.setVisibility(8);
                } else {
                    chatAttachAlert2.getClass();
                }
                break;
            case 2:
                ChatAttachAlert chatAttachAlert3 = this.f$0;
                if (!this.f$1) {
                    chatAttachAlert3.topAiButton.setVisibility(8);
                } else {
                    chatAttachAlert3.getClass();
                }
                break;
            default:
                ChatAttachAlert chatAttachAlert4 = this.f$0;
                if (!this.f$1) {
                    chatAttachAlert4.getClass();
                } else {
                    chatAttachAlert4.buttonsRecyclerViewWrapper.setVisibility(4);
                }
                break;
        }
    }
}
