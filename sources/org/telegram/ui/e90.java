package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class e90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35979a;
    public final LaunchActivity f35980b;

    public e90(LaunchActivity launchActivity, int i10) {
        this.f35979a = i10;
        this.f35980b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35979a;
        LaunchActivity launchActivity = this.f35980b;
        switch (i10) {
            case 0:
                launchActivity.f33466w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
