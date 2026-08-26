package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessageStatisticActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final MessageStatisticActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public MessageStatisticActivity$$ExternalSyntheticLambda3(MessageStatisticActivity messageStatisticActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = messageStatisticActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadChats$4(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$loadChats$6(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$loadStat$11(this.f$1, this.f$2);
                break;
        }
    }
}
