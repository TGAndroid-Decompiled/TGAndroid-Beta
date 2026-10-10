package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class d90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36950a;
    public final LaunchActivity f36951b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f36950a = i10;
        this.f36951b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f36950a;
        LaunchActivity launchActivity = this.f36951b;
        switch (i10) {
            case 0:
                launchActivity.f33857w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
