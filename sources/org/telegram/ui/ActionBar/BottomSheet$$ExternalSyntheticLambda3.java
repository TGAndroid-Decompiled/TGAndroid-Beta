package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

public final class BottomSheet$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public BottomSheet$$ExternalSyntheticLambda3(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((BottomSheet) this.f$0).lambda$dismissWithButtonClick$9(this.f$1, valueAnimator);
                break;
            case 1:
                TextSelectionHelper.ChatListTextSelectionHelper.lambda$onExitSelectionMode$1((ChatMessageCell) this.f$0, this.f$1, valueAnimator);
                break;
            default:
                SpoilerEffect spoilerEffect = (SpoilerEffect) this.f$0;
                spoilerEffect.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                spoilerEffect.rippleProgress = fFloatValue;
                spoilerEffect.setAlpha((int) ((1.0f - fFloatValue) * this.f$1));
                spoilerEffect.shouldInvalidateColor = true;
                spoilerEffect.invalidateSelf();
                break;
        }
    }
}
