package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda159 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda159(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$shareMyContact$127(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$createView$25(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$createMenu$254(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$processSelectedOption$331(tLObject, tL_error);
                break;
            case 4:
                this.f$0.lambda$openAttachBotLayout$219(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$startEditingMessageObject$313(tLObject, tL_error);
                break;
        }
    }
}
