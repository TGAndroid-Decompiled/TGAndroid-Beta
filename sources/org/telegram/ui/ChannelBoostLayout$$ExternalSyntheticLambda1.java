package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChannelBoostLayout$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final ChannelBoostLayout f$0;
    public final CountDownLatch f$1;
    public final Runnable f$2;

    public ChannelBoostLayout$$ExternalSyntheticLambda1(ChannelBoostLayout channelBoostLayout, CountDownLatch countDownLatch, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = channelBoostLayout;
        this.f$1 = countDownLatch;
        this.f$2 = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadOnlyGifts$10(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadOnlyBoosts$8(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
