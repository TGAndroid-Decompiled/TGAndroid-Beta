package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class FilterChatlistActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final FilterChatlistActivity f$0;
    public final TLRPC.TL_error f$1;

    public FilterChatlistActivity$$ExternalSyntheticLambda3(FilterChatlistActivity filterChatlistActivity, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = filterChatlistActivity;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$saveTitle$3(this.f$1);
                break;
            default:
                this.f$0.lambda$save$1(this.f$1);
                break;
        }
    }
}
