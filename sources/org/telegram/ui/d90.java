package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class d90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32984a;
    public final LaunchActivity f32985b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f32984a = i10;
        this.f32985b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f32984a;
        LaunchActivity launchActivity = this.f32985b;
        switch (i10) {
            case 0:
                launchActivity.f30853w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
