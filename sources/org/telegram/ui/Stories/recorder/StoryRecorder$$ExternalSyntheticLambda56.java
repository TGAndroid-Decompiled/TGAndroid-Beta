package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;

public final class StoryRecorder$$ExternalSyntheticLambda56 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda56(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.cropEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.f$0.cropEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                this.f$0.cropInlineEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                this.f$0.cropInlineEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                StoryRecorder storyRecorder = this.f$0;
                storyRecorder.getClass();
                storyRecorder.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyRecorder.checkBackgroundVisibility();
                storyRecorder.containerView.invalidate();
                storyRecorder.windowView.invalidate();
                break;
            default:
                this.f$0.galleryListView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
