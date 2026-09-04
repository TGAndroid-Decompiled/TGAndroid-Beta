package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class e90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35978a;
    public final LaunchActivity f35979b;

    public e90(LaunchActivity launchActivity, int i10) {
        this.f35978a = i10;
        this.f35979b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35978a;
        LaunchActivity launchActivity = this.f35979b;
        switch (i10) {
            case 0:
                launchActivity.f33465w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
