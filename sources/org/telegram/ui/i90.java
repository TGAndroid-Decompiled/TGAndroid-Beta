package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class i90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37072a;
    public final LaunchActivity f37073b;

    public i90(LaunchActivity launchActivity, int i10) {
        this.f37072a = i10;
        this.f37073b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f37072a;
        LaunchActivity launchActivity = this.f37073b;
        switch (i10) {
            case 0:
                launchActivity.f32145w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
