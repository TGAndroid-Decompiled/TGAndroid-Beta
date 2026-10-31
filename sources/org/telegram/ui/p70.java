package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class p70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40500a;
    public final LaunchActivity f40501b;

    public p70(LaunchActivity launchActivity, int i10) {
        this.f40500a = i10;
        this.f40501b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40500a;
        LaunchActivity launchActivity = this.f40501b;
        switch (i10) {
            case 0:
                launchActivity.f33389w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
