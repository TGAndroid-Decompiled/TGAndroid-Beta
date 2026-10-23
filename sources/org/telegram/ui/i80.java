package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class i80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37889a;
    public final LaunchActivity f37890b;

    public i80(LaunchActivity launchActivity, int i10) {
        this.f37889a = i10;
        this.f37890b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f37889a;
        LaunchActivity launchActivity = this.f37890b;
        switch (i10) {
            case 0:
                launchActivity.f33202w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
