package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class o80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40094a;
    public final LaunchActivity f40095b;

    public o80(LaunchActivity launchActivity, int i10) {
        this.f40094a = i10;
        this.f40095b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40094a;
        LaunchActivity launchActivity = this.f40095b;
        switch (i10) {
            case 0:
                launchActivity.f33499w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.E1;
                launchActivity.getClass();
                launchActivity.E0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
