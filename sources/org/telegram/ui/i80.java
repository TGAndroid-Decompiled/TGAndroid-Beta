package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class i80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37878a;
    public final LaunchActivity f37879b;

    public i80(LaunchActivity launchActivity, int i10) {
        this.f37878a = i10;
        this.f37879b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f37878a;
        LaunchActivity launchActivity = this.f37879b;
        switch (i10) {
            case 0:
                launchActivity.f33191w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
