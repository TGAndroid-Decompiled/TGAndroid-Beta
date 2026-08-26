package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.LinkedList;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class PasscodeView$$ExternalSyntheticLambda15 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PasscodeView$$ExternalSyntheticLambda15(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                PasscodeView passcodeView = (PasscodeView) this.f$0;
                passcodeView.backgroundAnimationSpring = null;
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) this.f$1;
                motionBackgroundDrawable.animationProgressProvider = null;
                motionBackgroundDrawable.updateAnimation();
                if (!z) {
                    motionBackgroundDrawable.posAnimationProgress = 1.0f;
                    motionBackgroundDrawable.updateAnimation();
                    LinkedList linkedList = passcodeView.backgroundSpringQueue;
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        passcodeView.backgroundSpringNextQueue.poll();
                    }
                }
                break;
            case 1:
                ((Bulletin.Layout) this.f$0).setInOutOffset(0.0f);
                if (!z) {
                    ((Bulletin$2$$ExternalSyntheticLambda1) this.f$1).run();
                }
                break;
            case 2:
                ((ChatAttachAlert) this.f$0).lambda$onCustomOpenAnimation$59((FilterGLThread$$ExternalSyntheticLambda1) this.f$1);
                break;
            case 3:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) ((StarGiftSheet.AnonymousClass13) this.f$0).this$0;
                chatAttachAlert.nextAttachLayout.setTranslationY(0.0f);
                chatAttachAlert.nextAttachLayout.onContainerTranslationUpdated(chatAttachAlert.currentPanTranslationY);
                ((BottomSheet) chatAttachAlert).containerView.invalidate();
                ((ChatAttachAlert$$ExternalSyntheticLambda7) this.f$1).run();
                chatAttachAlert.updateSelectedPosition(0);
                break;
            default:
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) this.f$0;
                if (dynamicAnimation == webViewSwipeContainer.scrollAnimator) {
                    webViewSwipeContainer.scrollAnimator = null;
                    Runnable runnable = (Runnable) this.f$1;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = webViewSwipeContainer.scrollEndListener;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f3 = webViewSwipeContainer.pendingOffsetY;
                    if (f3 != -1.0f) {
                        boolean z2 = webViewSwipeContainer.isSwipeOffsetAnimationDisallowed;
                        webViewSwipeContainer.isSwipeOffsetAnimationDisallowed = true;
                        webViewSwipeContainer.setOffsetY(f3);
                        webViewSwipeContainer.pendingOffsetY = -1.0f;
                        webViewSwipeContainer.isSwipeOffsetAnimationDisallowed = z2;
                    }
                    webViewSwipeContainer.pendingSwipeOffsetY = -2.1474836E9f;
                }
                break;
        }
    }
}
