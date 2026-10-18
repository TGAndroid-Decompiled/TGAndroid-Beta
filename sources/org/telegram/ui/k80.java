package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class k80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38429a;
    public final LaunchActivity f38430b;

    public k80(LaunchActivity launchActivity, int i10) {
        this.f38429a = i10;
        this.f38430b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f38429a;
        LaunchActivity launchActivity = this.f38430b;
        switch (i10) {
            case 0:
                launchActivity.f33185w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
