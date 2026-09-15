package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class d90 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32964a;
    public final LaunchActivity f32965b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f32964a = i10;
        this.f32965b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f32964a;
        LaunchActivity launchActivity = this.f32965b;
        switch (i10) {
            case 0:
                launchActivity.f30856w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
