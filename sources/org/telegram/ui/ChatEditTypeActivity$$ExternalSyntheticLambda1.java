package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;

    public ChatEditTypeActivity$$ExternalSyntheticLambda1(ChatEditTypeActivity chatEditTypeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadAdminedChannels$18(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$onFragmentCreate$1(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$tryActivateEditableUsername$16(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$tryDeactivateAllLinks$15(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadAdminedChannels$22(tLObject, tL_error);
                break;
        }
    }
}
