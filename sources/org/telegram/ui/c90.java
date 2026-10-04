package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class c90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35380a;
    public final LaunchActivity f35381b;

    public c90(LaunchActivity launchActivity, int i10) {
        this.f35380a = i10;
        this.f35381b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35380a;
        LaunchActivity launchActivity = this.f35381b;
        switch (i10) {
            case 0:
                launchActivity.f33816w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
