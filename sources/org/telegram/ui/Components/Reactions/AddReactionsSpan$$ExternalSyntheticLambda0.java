package org.telegram.ui.Components.Reactions;

import android.animation.ValueAnimator;

public final class AddReactionsSpan$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final AddReactionsSpan f$0;
    public final CustomReactionEditText f$1;

    public AddReactionsSpan$$ExternalSyntheticLambda0(AddReactionsSpan addReactionsSpan, CustomReactionEditText customReactionEditText, int i) {
        this.$r8$classId = i;
        this.f$0 = addReactionsSpan;
        this.f$1 = customReactionEditText;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f$1.invalidate();
                break;
            default:
                this.f$0.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f$1.invalidate();
                break;
        }
    }
}
