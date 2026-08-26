package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class PhotoViewer$$ExternalSyntheticLambda6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final float f$2;

    public PhotoViewer$$ExternalSyntheticLambda6(Object obj, float f, float f2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = f2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.f$2;
        float f2 = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) obj).lambda$cropRotate$100(f2, f, valueAnimator);
                break;
            case 1:
                FactorAnimator factorAnimator = (FactorAnimator) obj;
                if (factorAnimator.isAnimating) {
                    DecelerateInterpolator decelerateInterpolator = AnimatorUtils.DECELERATE_INTERPOLATOR;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float f3 = (f * animatedFraction) + f2;
                    if (factorAnimator.factor != f3) {
                        factorAnimator.factor = f3;
                        factorAnimator.target.onFactorChanged(factorAnimator.id, f3, animatedFraction, factorAnimator);
                    }
                }
                break;
            case 2:
                ((PrivateVideoPreviewDialogNew) obj).lambda$new$2(f2, f, valueAnimator);
                break;
            case 3:
                ((PollCreateActivity) obj).lambda$animateEmojiViewTranslationY$3(f2, f, valueAnimator);
                break;
            default:
                StoryRecorder storyRecorder = (StoryRecorder) obj;
                storyRecorder.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyRecorder.containerView.setTranslationY(f2 * fFloatValue);
                storyRecorder.containerView.setTranslationY2(f * fFloatValue);
                break;
        }
    }
}
