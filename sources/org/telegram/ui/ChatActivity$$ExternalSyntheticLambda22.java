package org.telegram.ui;

import org.telegram.tgnet.TLObject;

public final class ChatActivity$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final TLObject f$1;

    public ChatActivity$$ExternalSyntheticLambda22(ChatActivity chatActivity, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createMenu$253(this.f$1);
                break;
            case 1:
                this.f$0.lambda$openAttachBotLayout$218(this.f$1);
                break;
            case 2:
                this.f$0.lambda$processSelectedOption$330(this.f$1);
                break;
            default:
                this.f$0.lambda$startEditingMessageObject$312(this.f$1);
                break;
        }
    }
}
