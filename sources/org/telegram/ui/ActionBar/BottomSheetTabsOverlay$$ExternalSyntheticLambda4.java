package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class BottomSheetTabsOverlay$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final BottomSheetTabsOverlay f$0;

    public BottomSheetTabsOverlay$$ExternalSyntheticLambda4(BottomSheetTabsOverlay bottomSheetTabsOverlay, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetTabsOverlay;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                BottomSheetTabsOverlay bottomSheetTabsOverlay = this.f$0;
                bottomSheetTabsOverlay.getClass();
                bottomSheetTabsOverlay.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bottomSheetTabsOverlay.invalidate();
                break;
            case 1:
                BottomSheetTabsOverlay bottomSheetTabsOverlay2 = this.f$0;
                bottomSheetTabsOverlay2.getClass();
                bottomSheetTabsOverlay2.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bottomSheetTabsOverlay2.invalidate();
                break;
            default:
                BottomSheetTabsOverlay bottomSheetTabsOverlay3 = this.f$0;
                bottomSheetTabsOverlay3.getClass();
                bottomSheetTabsOverlay3.offset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
