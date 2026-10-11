package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ix0 extends TimeAnimator {
    public int f27475a;
    public int f27476b;
    public ValueAnimator.AnimatorUpdateListener f27477c;
    public Float d;
    public float[] f27478e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27477c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f27477c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f27478e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                ix0 ix0Var = ix0.this;
                int i11 = ix0Var.f27475a;
                if (i11 > 0 && (i10 = ix0Var.f27476b) > 0) {
                    int i12 = i11 - 1;
                    ix0Var.f27475a = i12;
                    if (ix0Var.f27477c != null) {
                        float[] fArr = ix0Var.f27478e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = ix0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = ix0Var.f27478e;
                            float f7 = fArr2[0];
                            ix0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            ix0Var.f27477c.onAnimationUpdate(ix0Var);
                            return;
                        }
                        ix0Var.end();
                        return;
                    }
                    return;
                }
                ix0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f27475a = duration;
        this.f27476b = duration;
        super.start();
    }
}
