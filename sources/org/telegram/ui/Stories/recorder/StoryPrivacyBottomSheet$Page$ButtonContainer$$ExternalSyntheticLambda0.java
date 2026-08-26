package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;

public final class StoryPrivacyBottomSheet$Page$ButtonContainer$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StoryPrivacyBottomSheet.Page.ButtonContainer f$0;

    public StoryPrivacyBottomSheet$Page$ButtonContainer$$ExternalSyntheticLambda0(StoryPrivacyBottomSheet.Page.ButtonContainer buttonContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonContainer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$hide$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$translateY$1(valueAnimator);
                break;
        }
    }
}
