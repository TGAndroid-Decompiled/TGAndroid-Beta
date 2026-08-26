package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatEditActivity$$ExternalSyntheticLambda40 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatEditActivity f$0;

    public ChatEditActivity$$ExternalSyntheticLambda40(ChatEditActivity chatEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ChatEditActivity chatEditActivity = this.f$0;
                chatEditActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(chatEditActivity, tL_error, tLObject, 25));
                break;
            case 1:
                ChatEditActivity chatEditActivity2 = this.f$0;
                chatEditActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda49(chatEditActivity2, 1));
                break;
            default:
                ChatEditActivity chatEditActivity3 = this.f$0;
                chatEditActivity3.getClass();
                AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda49(chatEditActivity3, 4));
                break;
        }
    }
}
