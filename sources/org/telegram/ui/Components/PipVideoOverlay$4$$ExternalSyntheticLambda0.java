package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class PipVideoOverlay$4$$ExternalSyntheticLambda0 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;

    public PipVideoOverlay$4$$ExternalSyntheticLambda0(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                PipVideoOverlay.AnonymousClass4 anonymousClass4 = (PipVideoOverlay.AnonymousClass4) this.f$0;
                if (!z) {
                    PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
                    SpringForce springForce = pipVideoOverlay.pipXSpring.mSpring;
                    int i = pipVideoOverlay.pipWidth;
                    float f3 = (i / 2.0f) + this.f$1;
                    int i2 = AndroidUtilities.displaySize.x;
                    springForce.mFinalPosition = f3 >= ((float) i2) / 2.0f ? (i2 - i) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                }
                break;
            case 1:
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
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) this.f$0;
                webViewSwipeContainer.offsetYAnimator = null;
                float f4 = this.f$1;
                if (!z) {
                    webViewSwipeContainer.offsetY = f4;
                    webViewSwipeContainer.invalidateTranslation();
                } else {
                    webViewSwipeContainer.pendingOffsetY = f4;
                }
                break;
        }
    }
}
