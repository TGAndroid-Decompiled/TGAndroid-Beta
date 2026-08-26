package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.CrossfadeDrawable;

public final class ChatActivity$$ExternalSyntheticLambda451 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final CrossfadeDrawable f$0;

    public ChatActivity$$ExternalSyntheticLambda451(CrossfadeDrawable crossfadeDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = crossfadeDrawable;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CrossfadeDrawable crossfadeDrawable = this.f$0;
                crossfadeDrawable.progress = fFloatValue;
                crossfadeDrawable.invalidateSelf();
                break;
            default:
                CrossfadeDrawable crossfadeDrawable2 = this.f$0;
                crossfadeDrawable2.getClass();
                crossfadeDrawable2.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                crossfadeDrawable2.invalidateSelf();
                crossfadeDrawable2.invalidateSelf();
                break;
        }
    }
}
