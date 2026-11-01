package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class o70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40069a;
    public final LaunchActivity f40070b;

    public o70(LaunchActivity launchActivity, int i10) {
        this.f40069a = i10;
        this.f40070b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40069a;
        LaunchActivity launchActivity = this.f40070b;
        switch (i10) {
            case 0:
                launchActivity.f33396w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
