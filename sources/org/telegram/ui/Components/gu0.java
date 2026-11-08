package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class gu0 extends TimeAnimator {
    public int f34022a;
    public int f34023b;
    public ValueAnimator.AnimatorUpdateListener f34024c;
    public Float d;
    public float[] f34025e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f34024c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f34024c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f34025e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                gu0 gu0Var = gu0.this;
                int i10 = gu0Var.f34022a;
                if (i10 > 0 && (i7 = gu0Var.f34023b) > 0) {
                    int i11 = i10 - 1;
                    gu0Var.f34022a = i11;
                    if (gu0Var.f34024c != null) {
                        float[] fArr = gu0Var.f34025e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = gu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = gu0Var.f34025e;
                            float f10 = fArr2[0];
                            gu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            gu0Var.f34024c.onAnimationUpdate(gu0Var);
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
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f22566t);
        this.f34022a = duration;
        this.f34023b = duration;
        super.start();
    }
}
