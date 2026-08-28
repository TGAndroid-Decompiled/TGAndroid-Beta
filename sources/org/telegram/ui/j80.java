package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class j80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39397a;
    public final LaunchActivity f39398b;

    public j80(LaunchActivity launchActivity, int i9) {
        this.f39397a = i9;
        this.f39398b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.f39397a;
        LaunchActivity launchActivity = this.f39398b;
        switch (i9) {
            case 0:
                launchActivity.f35530s0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.f35493x1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
