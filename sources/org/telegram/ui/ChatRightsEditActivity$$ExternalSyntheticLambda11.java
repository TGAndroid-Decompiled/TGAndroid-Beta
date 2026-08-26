package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.CrossfadeDrawable;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda11 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatRightsEditActivity f$0;

    public ChatRightsEditActivity$$ExternalSyntheticLambda11(ChatRightsEditActivity chatRightsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatRightsEditActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatRightsEditActivity chatRightsEditActivity = this.f$0;
                chatRightsEditActivity.getClass();
                chatRightsEditActivity.asAdminT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = chatRightsEditActivity.addBotButton;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                }
                break;
            default:
                ChatRightsEditActivity chatRightsEditActivity2 = this.f$0;
                CrossfadeDrawable crossfadeDrawable = chatRightsEditActivity2.doneDrawable;
                crossfadeDrawable.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                crossfadeDrawable.invalidateSelf();
                chatRightsEditActivity2.doneDrawable.invalidateSelf();
                break;
        }
    }
}
