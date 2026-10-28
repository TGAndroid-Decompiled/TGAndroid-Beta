package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class o80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42013a;
    public final LaunchActivity f42014b;

    public o80(LaunchActivity launchActivity, int i10) {
        this.f42013a = i10;
        this.f42014b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f42013a;
        LaunchActivity launchActivity = this.f42014b;
        switch (i10) {
            case 0:
                launchActivity.f35589w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.E0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
