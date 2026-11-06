package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class gu0 extends TimeAnimator {
    public int f34042a;
    public int f34043b;
    public ValueAnimator.AnimatorUpdateListener f34044c;
    public Float d;
    public float[] f34045e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f34044c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f34044c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f34045e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                gu0 gu0Var = gu0.this;
                int i10 = gu0Var.f34042a;
                if (i10 > 0 && (i7 = gu0Var.f34043b) > 0) {
                    int i11 = i10 - 1;
                    gu0Var.f34042a = i11;
                    if (gu0Var.f34044c != null) {
                        float[] fArr = gu0Var.f34045e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = gu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = gu0Var.f34045e;
                            float f10 = fArr2[0];
                            gu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            gu0Var.f34044c.onAnimationUpdate(gu0Var);
                            return;
                        }
                        gu0Var.end();
                        return;
                    }
                    return;
                }
                gu0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f22540t);
        this.f34042a = duration;
        this.f34043b = duration;
        super.start();
    }
}
