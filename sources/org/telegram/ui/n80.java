package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;

public final class n80 implements ValueAnimator.AnimatorUpdateListener {

    public final int f40685a;

    public final LaunchActivity f40686b;

    public n80(LaunchActivity launchActivity, int i10) {
        this.f40685a = i10;
        this.f40686b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40685a;
        LaunchActivity launchActivity = this.f40686b;
        switch (i10) {
            case 0:
                launchActivity.f35533s0.invalidate();
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
