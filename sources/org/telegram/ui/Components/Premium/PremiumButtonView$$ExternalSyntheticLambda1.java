package org.telegram.ui.Components.Premium;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.StatisticActivity;

public final class PremiumButtonView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public PremiumButtonView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RLottieImageView rLottieImageView = ((PremiumButtonView) this.f$0).iconView;
                rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, true);
                rLottieImageView.playAnimation();
                break;
            case 1:
                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                limitReachedBottomSheet.getBaseFragment().presentFragment(StatisticActivity.create(LimitReachedBottomSheet.access$1800(limitReachedBottomSheet)));
                break;
            case 2:
                PremiumFeatureBottomSheet.this.checkTopOffset();
                break;
            case 3:
                PremiumStickersPreviewRecycler premiumStickersPreviewRecycler = (PremiumStickersPreviewRecycler) this.f$0;
                int size = 1073741823 - (1073741823 % premiumStickersPreviewRecycler.premiumStickers.size());
                LinearLayoutManager linearLayoutManager = premiumStickersPreviewRecycler.layoutManager;
                premiumStickersPreviewRecycler.selectStickerOnNextLayout = size;
                linearLayoutManager.scrollToPositionWithOffset(size, (premiumStickersPreviewRecycler.getMeasuredHeight() - premiumStickersPreviewRecycler.getChildAt(0).getMeasuredHeight()) >> 1);
                premiumStickersPreviewRecycler.drawEffectForView(null, false);
                break;
            case 4:
                ((ProfilePremiumCell) this.f$0).invalidate();
                break;
            default:
                ((VideoScreenPreview) this.f$0).checkVideo();
                break;
        }
    }
}
