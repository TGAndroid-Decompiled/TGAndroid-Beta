package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class b90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32292a;
    public final LaunchActivity f32293b;

    public b90(LaunchActivity launchActivity, int i10) {
        this.f32292a = i10;
        this.f32293b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f32292a;
        LaunchActivity launchActivity = this.f32293b;
        switch (i10) {
            case 0:
                launchActivity.f31144w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
