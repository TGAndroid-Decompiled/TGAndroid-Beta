package org.telegram.ui.Stories.recorder;

import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class StoryRecorder$$ExternalSyntheticLambda92 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;

    public StoryRecorder$$ExternalSyntheticLambda92(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                if (!z) {
                    storyRecorder.galleryListView.setTranslationY(this.f$1);
                    storyRecorder.galleryListView.ignoreScroll = false;
                    storyRecorder.galleryOpenCloseSpringAnimator = null;
                    storyRecorder.galleryListViewOpening = null;
                } else {
                    storyRecorder.getClass();
                }
                break;
            default:
                ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) this.f$0).lambda$setOffsetY$2(this.f$1, dynamicAnimation, z, f, f2);
                break;
        }
    }
}
