package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatEditActivity$$ExternalSyntheticLambda3 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatEditActivity f$0;

    public ChatEditActivity$$ExternalSyntheticLambda3(ChatEditActivity chatEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openSetPhotoAlert$54(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$didUploadPhoto$58(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadLinksCount$1(tLObject, tL_error);
                break;
        }
    }
}
