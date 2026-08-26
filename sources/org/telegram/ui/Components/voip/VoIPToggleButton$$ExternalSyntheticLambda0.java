package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class VoIPToggleButton$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final VoIPToggleButton f$0;

    public VoIPToggleButton$$ExternalSyntheticLambda0(VoIPToggleButton voIPToggleButton, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPToggleButton;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setChecked$2(valueAnimator);
                break;
            default:
                this.f$0.lambda$setPressedBtn$0(valueAnimator);
                break;
        }
    }
}
