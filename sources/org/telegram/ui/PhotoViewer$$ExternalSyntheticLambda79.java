package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class PhotoViewer$$ExternalSyntheticLambda79 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final float f$2;

    public PhotoViewer$$ExternalSyntheticLambda79(Object obj, float f, float f2, int i) {
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
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.photoCropView.cropView.areaView;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f2;
                float f3 = photoViewer.scale;
                float f4 = ((photoViewer.animateToScale - f3) * photoViewer.animationValue) + f3;
                cropAreaView.rotate = fFloatValue;
                cropAreaView.scale = f4;
                cropAreaView.tx = 0.0f;
                cropAreaView.ty = 0.0f;
                cropAreaView.invalidate();
                photoViewer.photoCropView.wheelView.setRotation$1(AndroidUtilities.lerp(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 1:
                FactorAnimator factorAnimator = (FactorAnimator) obj;
                if (factorAnimator.isAnimating) {
                    DecelerateInterpolator decelerateInterpolator = AnimatorUtils.DECELERATE_INTERPOLATOR;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float f5 = (f * animatedFraction) + f2;
                    if (factorAnimator.factor != f5) {
                        factorAnimator.factor = f5;
                        factorAnimator.target.onFactorChanged(factorAnimator.id, f5, animatedFraction, factorAnimator);
                    }
                }
                break;
            case 2:
                EmojiTabsStrip emojiTabsStrip = (EmojiTabsStrip) obj;
                emojiTabsStrip.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                emojiTabsStrip.selectAnimationT = fFloatValue2;
                emojiTabsStrip.selectT = AndroidUtilities.lerp(f2, f, fFloatValue2);
                emojiTabsStrip.contentView.invalidate();
                break;
            case 3:
                VoIPFragment.AnonymousClass24 anonymousClass24 = (VoIPFragment.AnonymousClass24) obj;
                anonymousClass24.openProgress1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fDp = f2 + AndroidUtilities.dp(28.0f);
                float fDp2 = f + AndroidUtilities.dp(52.0f);
                float f6 = anonymousClass24.openProgress1;
                anonymousClass24.openTranslationX = fDp - (fDp * f6);
                anonymousClass24.openTranslationY = fDp2 - (f6 * fDp2);
                anonymousClass24.invalidate();
                break;
            default:
                StoryRecorder storyRecorder = (StoryRecorder) obj;
                storyRecorder.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyRecorder.containerView.setTranslationY(f2 * fFloatValue3);
                storyRecorder.containerView.setTranslationY2(f * fFloatValue3);
                break;
        }
    }
}
