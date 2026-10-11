package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class c90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36642a;
    public final LaunchActivity f36643b;

    public c90(LaunchActivity launchActivity, int i10) {
        this.f36642a = i10;
        this.f36643b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f36642a;
        LaunchActivity launchActivity = this.f36643b;
        switch (i10) {
            case 0:
                launchActivity.f33847w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
