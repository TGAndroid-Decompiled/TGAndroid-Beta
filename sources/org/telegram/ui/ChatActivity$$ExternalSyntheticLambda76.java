package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda76 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final TLRPC.TL_attachMenuBot f$1;
    public final TLRPC.User f$2;

    public ChatActivity$$ExternalSyntheticLambda76(ChatActivity chatActivity, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = tL_attachMenuBot;
        this.f$2 = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openAttachBotLayout$210(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$openAttachBotLayout$213(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
