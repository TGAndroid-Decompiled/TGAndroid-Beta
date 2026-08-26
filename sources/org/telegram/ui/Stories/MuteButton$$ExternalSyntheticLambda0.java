package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.core.graphics.ColorUtils;

public final class MuteButton$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final MuteButton f$0;

    public MuteButton$$ExternalSyntheticLambda0(MuteButton muteButton, int i) {
        this.$r8$classId = i;
        this.f$0 = muteButton;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                MuteButton muteButton = this.f$0;
                muteButton.getClass();
                muteButton.loadingView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                MuteButton muteButton2 = this.f$0;
                muteButton2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muteButton2.mutedT = fFloatValue;
                View view = muteButton2.filledBackgroundView;
                view.setAlpha(1.0f - fFloatValue);
                view.setScaleX(1.0f - muteButton2.mutedT);
                view.setScaleY(1.0f - muteButton2.mutedT);
                muteButton2.image.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(muteButton2.mutedT, -1, -2960428), PorterDuff.Mode.SRC_IN));
                muteButton2.layout.invalidate();
                break;
        }
    }
}
