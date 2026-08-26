package org.telegram.ui.Stories;

import android.animation.ValueAnimator;

public final class StoryViewer$2$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StoryViewer.AnonymousClass2 f$0;

    public StoryViewer$2$$ExternalSyntheticLambda1(StoryViewer.AnonymousClass2 anonymousClass2, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                StoryViewer.AnonymousClass2 anonymousClass2 = this.f$0;
                anonymousClass2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.swipeToDismissHorizontalOffset = fFloatValue;
                StoryViewer.access$700(storyViewer);
                break;
            default:
                StoryViewer.AnonymousClass2 anonymousClass3 = this.f$0;
                anonymousClass3.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                StoryViewer storyViewer2 = StoryViewer.this;
                storyViewer2.swipeToDismissOffset = fFloatValue2;
                StoryViewer.access$700(storyViewer2);
                break;
        }
    }
}
