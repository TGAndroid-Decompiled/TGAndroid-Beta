package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class e90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33290a;
    public final LaunchActivity f33291b;

    public e90(LaunchActivity launchActivity, int i10) {
        this.f33290a = i10;
        this.f33291b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f33290a;
        LaunchActivity launchActivity = this.f33291b;
        switch (i10) {
            case 0:
                launchActivity.f31140w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
