package org.telegram.ui.bots;

import android.animation.ValueAnimator;

public final class BotWebViewSheet$$ExternalSyntheticLambda12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final BotWebViewSheet f$0;

    public BotWebViewSheet$$ExternalSyntheticLambda12(BotWebViewSheet botWebViewSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewSheet;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewSheet botWebViewSheet = this.f$0;
                botWebViewSheet.getClass();
                botWebViewSheet.openedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                botWebViewSheet.checkNavBarColor();
                break;
            default:
                BotWebViewSheet botWebViewSheet2 = this.f$0;
                botWebViewSheet2.getClass();
                botWebViewSheet2.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
