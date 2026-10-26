package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class n80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41804a;
    public final LaunchActivity f41805b;

    public n80(LaunchActivity launchActivity, int i10) {
        this.f41804a = i10;
        this.f41805b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f41804a;
        LaunchActivity launchActivity = this.f41805b;
        switch (i10) {
            case 0:
                launchActivity.f35565w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.E0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
