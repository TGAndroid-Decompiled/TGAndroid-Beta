package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

public final class ChannelBoostLayout$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChannelBoostLayout f$0;

    public ChannelBoostLayout$$ExternalSyntheticLambda2(ChannelBoostLayout channelBoostLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = channelBoostLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChannelBoostLayout channelBoostLayout = this.f$0;
                channelBoostLayout.getClass();
                CountDownLatch countDownLatch = new CountDownLatch(2);
                channelBoostLayout.loadOnlyBoosts(countDownLatch, null);
                channelBoostLayout.loadOnlyGifts(countDownLatch, null);
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new ChannelBoostLayout$$ExternalSyntheticLambda2(channelBoostLayout, 3));
                break;
            case 1:
                ChannelBoostLayout channelBoostLayout2 = this.f$0;
                channelBoostLayout2.usersLoading = false;
                channelBoostLayout2.updateRows(true);
                break;
            case 2:
                ChannelBoostLayout channelBoostLayout3 = this.f$0;
                channelBoostLayout3.usersLoading = false;
                channelBoostLayout3.updateRows(true);
                break;
            default:
                ChannelBoostLayout channelBoostLayout4 = this.f$0;
                channelBoostLayout4.usersLoading = false;
                channelBoostLayout4.updateRows(true);
                break;
        }
    }
}
