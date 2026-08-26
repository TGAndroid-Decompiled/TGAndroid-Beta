package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class FilterChatlistActivity$$ExternalSyntheticLambda8 implements RequestDelegate {
    public final int $r8$classId;
    public final FilterChatlistActivity f$0;

    public FilterChatlistActivity$$ExternalSyntheticLambda8(FilterChatlistActivity filterChatlistActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filterChatlistActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$save$2(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$saveTitle$4(tLObject, tL_error);
                break;
        }
    }
}
