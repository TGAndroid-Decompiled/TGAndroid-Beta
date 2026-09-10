package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class d90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31865a;
    public final LaunchActivity f31866b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f31865a = i10;
        this.f31866b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31865a;
        LaunchActivity launchActivity = this.f31866b;
        switch (i10) {
            case 0:
                launchActivity.f29969w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
