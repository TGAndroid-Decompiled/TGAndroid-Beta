package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class xw0 extends TimeAnimator {
    public int f32467a;
    public int f32468b;
    public ValueAnimator.AnimatorUpdateListener f32469c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f32469c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f32469c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                xw0 xw0Var = xw0.this;
                int i11 = xw0Var.f32467a;
                if (i11 > 0 && (i10 = xw0Var.f32468b) > 0) {
                    int i12 = i11 - 1;
                    xw0Var.f32467a = i12;
                    if (xw0Var.f32469c != null) {
                        float[] fArr = xw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = xw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = xw0Var.e;
                            float f7 = fArr2[0];
                            xw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            xw0Var.f32469c.onAnimationUpdate(xw0Var);
                            return;
                        }
                        xw0Var.end();
                        return;
                    }
                    return;
                }
                xw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f32467a = duration;
        this.f32468b = duration;
        super.start();
    }
}
