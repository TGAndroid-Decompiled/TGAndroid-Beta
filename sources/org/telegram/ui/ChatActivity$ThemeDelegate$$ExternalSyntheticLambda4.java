package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public final class ChatActivity$ThemeDelegate$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final MotionBackgroundDrawable f$0;

    public ChatActivity$ThemeDelegate$$ExternalSyntheticLambda4(MotionBackgroundDrawable motionBackgroundDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = motionBackgroundDrawable;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MotionBackgroundDrawable motionBackgroundDrawable = this.f$0;
                motionBackgroundDrawable.patternAlpha = fFloatValue;
                motionBackgroundDrawable.invalidateParent();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MotionBackgroundDrawable motionBackgroundDrawable2 = this.f$0;
                motionBackgroundDrawable2.patternAlpha = fFloatValue2;
                motionBackgroundDrawable2.invalidateParent();
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MotionBackgroundDrawable motionBackgroundDrawable3 = this.f$0;
                motionBackgroundDrawable3.patternAlpha = fFloatValue3;
                motionBackgroundDrawable3.invalidateParent();
                break;
        }
    }
}
