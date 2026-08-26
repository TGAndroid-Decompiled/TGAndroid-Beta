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
                ChatActivity.ThemeDelegate.lambda$getBackgroundDrawableFromTheme$7(this.f$0, valueAnimator);
                break;
            case 1:
                ChatActivity.ThemeDelegate.lambda$setupChatTheme$4(this.f$0, valueAnimator);
                break;
            default:
                ChatActivity.ThemeDelegate.lambda$setupChatTheme$5(this.f$0, valueAnimator);
                break;
        }
    }
}
