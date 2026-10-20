package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class i80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37884a;
    public final LaunchActivity f37885b;

    public i80(LaunchActivity launchActivity, int i10) {
        this.f37884a = i10;
        this.f37885b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f37884a;
        LaunchActivity launchActivity = this.f37885b;
        switch (i10) {
            case 0:
                launchActivity.f33197w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
