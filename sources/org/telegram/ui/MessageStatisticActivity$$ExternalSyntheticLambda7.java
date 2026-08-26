package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessageStatisticActivity$$ExternalSyntheticLambda7 implements RequestDelegate {
    public final int $r8$classId;
    public final MessageStatisticActivity f$0;

    public MessageStatisticActivity$$ExternalSyntheticLambda7(MessageStatisticActivity messageStatisticActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = messageStatisticActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadStat$12(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$loadChats$5(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadChats$7(tLObject, tL_error);
                break;
        }
    }
}
