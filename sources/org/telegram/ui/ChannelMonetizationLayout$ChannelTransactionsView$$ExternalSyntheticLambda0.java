package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChannelMonetizationLayout$ChannelTransactionsView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChannelMonetizationLayout.ChannelTransactionsView f$0;
    public final TLObject f$1;
    public final int f$2;
    public final TLRPC.TL_error f$3;
    public final boolean f$4;
    public final boolean f$5;

    public ChannelMonetizationLayout$ChannelTransactionsView$$ExternalSyntheticLambda0(ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView, TLObject tLObject, int i, TLRPC.TL_error tL_error, boolean z, boolean z2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = channelTransactionsView;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = tL_error;
        this.f$4 = z;
        this.f$5 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadTransactions$2(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
            default:
                this.f$0.lambda$loadTransactions$0(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
        }
    }
}
