package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class a90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31709a;
    public final LaunchActivity f31710b;

    public a90(LaunchActivity launchActivity, int i10) {
        this.f31709a = i10;
        this.f31710b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31709a;
        LaunchActivity launchActivity = this.f31710b;
        switch (i10) {
            case 0:
                launchActivity.f30827w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
