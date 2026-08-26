package org.telegram.ui.Gifts;

import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.utils.CountdownTimer;

public final class AuctionBidSheet$$ExternalSyntheticLambda0 implements FactorAnimator.Target, CountdownTimer.Callback {
    public final AuctionBidSheet f$0;

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.updateColors$9();
    }

    @Override
    public void onTimerUpdate(long j) {
        AuctionBidSheet auctionBidSheet = this.f$0;
        auctionBidSheet.updateCountdownCell(j, auctionBidSheet.isOpenAnimationEnd);
    }
}
