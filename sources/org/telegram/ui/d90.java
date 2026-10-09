package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class d90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36904a;
    public final LaunchActivity f36905b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f36904a = i10;
        this.f36905b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f36904a;
        LaunchActivity launchActivity = this.f36905b;
        switch (i10) {
            case 0:
                launchActivity.f33819w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
