package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class o80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40099a;
    public final LaunchActivity f40100b;

    public o80(LaunchActivity launchActivity, int i10) {
        this.f40099a = i10;
        this.f40100b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40099a;
        LaunchActivity launchActivity = this.f40100b;
        switch (i10) {
            case 0:
                launchActivity.f33501w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.E0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
