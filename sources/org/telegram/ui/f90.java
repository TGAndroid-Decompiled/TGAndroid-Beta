package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class f90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33588a;
    public final LaunchActivity f33589b;

    public f90(LaunchActivity launchActivity, int i10) {
        this.f33588a = i10;
        this.f33589b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f33588a;
        LaunchActivity launchActivity = this.f33589b;
        switch (i10) {
            case 0:
                launchActivity.f30870w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
