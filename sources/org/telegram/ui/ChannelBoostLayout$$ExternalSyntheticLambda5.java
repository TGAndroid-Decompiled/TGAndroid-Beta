package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;

public final class ChannelBoostLayout$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final ChannelBoostLayout f$0;
    public final CountDownLatch f$1;
    public final TLObject f$2;
    public final Runnable f$3;

    public ChannelBoostLayout$$ExternalSyntheticLambda5(ChannelBoostLayout channelBoostLayout, CountDownLatch countDownLatch, TLObject tLObject, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = channelBoostLayout;
        this.f$1 = countDownLatch;
        this.f$2 = tLObject;
        this.f$3 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadOnlyGifts$9(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$loadOnlyBoosts$7(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
