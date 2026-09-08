package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class e90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36005a;
    public final LaunchActivity f36006b;

    public e90(LaunchActivity launchActivity, int i10) {
        this.f36005a = i10;
        this.f36006b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f36005a;
        LaunchActivity launchActivity = this.f36006b;
        switch (i10) {
            case 0:
                launchActivity.f33492w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
