package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class m80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40490a;
    public final LaunchActivity f40491b;

    public m80(LaunchActivity launchActivity, int i10) {
        this.f40490a = i10;
        this.f40491b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40490a;
        LaunchActivity launchActivity = this.f40491b;
        switch (i10) {
            case 0:
                launchActivity.f35597s0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
