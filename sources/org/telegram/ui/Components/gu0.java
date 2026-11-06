package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class gu0 extends TimeAnimator {
    public int f33990a;
    public int f33991b;
    public ValueAnimator.AnimatorUpdateListener f33992c;
    public Float d;
    public float[] f33993e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f33992c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f33992c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f33993e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                gu0 gu0Var = gu0.this;
                int i10 = gu0Var.f33990a;
                if (i10 > 0 && (i7 = gu0Var.f33991b) > 0) {
                    int i11 = i10 - 1;
                    gu0Var.f33990a = i11;
                    if (gu0Var.f33992c != null) {
                        float[] fArr = gu0Var.f33993e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = gu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = gu0Var.f33993e;
                            float f10 = fArr2[0];
                            gu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            gu0Var.f33992c.onAnimationUpdate(gu0Var);
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
        this.f33990a = duration;
        this.f33991b = duration;
        super.start();
    }
}
