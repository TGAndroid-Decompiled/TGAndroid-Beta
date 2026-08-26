package org.telegram.ui.Gifts;

import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.ui.Components.AnimatedTextView;

public final class AuctionBidSheet$$ExternalSyntheticLambda0 implements FactorAnimator.Target, CountdownTimer.Callback {
    public final AuctionBidSheet f$0;

    public AuctionBidSheet$$ExternalSyntheticLambda0(AuctionBidSheet auctionBidSheet) {
        this.f$0 = auctionBidSheet;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.updateColors$1();
    }

    @Override
    public void onTimerUpdate(long j) {
        AuctionBidSheet auctionBidSheet = this.f$0;
        ((AnimatedTextView) auctionBidSheet.nextRoundCell.rect).setText(j >= 3600 ? AndroidUtilities.formatFullDuration((int) j) : AndroidUtilities.formatDurationNoHours((int) j, true), auctionBidSheet.isOpenAnimationEnd);
    }
}
