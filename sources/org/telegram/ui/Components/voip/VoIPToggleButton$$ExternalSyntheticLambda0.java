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
                VoIPToggleButton voIPToggleButton = this.f$0;
                voIPToggleButton.getClass();
                voIPToggleButton.checkedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPToggleButton.setBackgroundColor(voIPToggleButton.backgroundCheck1, voIPToggleButton.backgroundCheck2);
                break;
            default:
                VoIPToggleButton voIPToggleButton2 = this.f$0;
                voIPToggleButton2.getClass();
                voIPToggleButton2.pressedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPToggleButton2.invalidate();
                break;
        }
    }
}
