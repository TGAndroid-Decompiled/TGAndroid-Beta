package org.telegram.ui;

import org.telegram.messenger.MessageObject;

public final class ChatActivity$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final MessageObject f$1;

    public ChatActivity$$ExternalSyntheticLambda12(ChatActivity chatActivity, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didLongPressLink$414(this.f$1);
                break;
            case 1:
                ReportBottomSheet.AnonymousClass4.lambda$onHidden$2(this.f$0, this.f$1);
                break;
            case 2:
                this.f$0.lambda$sendSecretMessageRead$148(this.f$1);
                break;
            case 3:
                this.f$0.lambda$createView$47(this.f$1);
                break;
            case 4:
                this.f$0.lambda$createMenu$250(this.f$1);
                break;
            case 5:
                this.f$0.lambda$createMenu$251(this.f$1);
                break;
            case 6:
                this.f$0.lambda$createMenu$252(this.f$1);
                break;
            case 7:
                this.f$0.lambda$updateMessagesVisiblePart$153(this.f$1);
                break;
            default:
                this.f$0.lambda$unpinMessage$315(this.f$1);
                break;
        }
    }
}
