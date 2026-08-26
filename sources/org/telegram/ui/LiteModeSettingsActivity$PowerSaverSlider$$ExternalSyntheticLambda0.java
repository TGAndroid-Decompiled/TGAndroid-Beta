package org.telegram.ui;

import android.animation.ValueAnimator;

public final class LiteModeSettingsActivity$PowerSaverSlider$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LiteModeSettingsActivity.PowerSaverSlider f$0;

    public LiteModeSettingsActivity$PowerSaverSlider$$ExternalSyntheticLambda0(LiteModeSettingsActivity.PowerSaverSlider powerSaverSlider, int i) {
        this.$r8$classId = i;
        this.f$0 = powerSaverSlider;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateOnActive$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$updateOffActive$1(valueAnimator);
                break;
        }
    }
}
