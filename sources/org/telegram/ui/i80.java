package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class i80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37885a;
    public final LaunchActivity f37886b;

    public i80(LaunchActivity launchActivity, int i10) {
        this.f37885a = i10;
        this.f37886b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f37885a;
        LaunchActivity launchActivity = this.f37886b;
        switch (i10) {
            case 0:
                launchActivity.f33198w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
