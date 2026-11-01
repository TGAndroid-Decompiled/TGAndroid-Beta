package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class jv0 extends TimeAnimator {
    public int f27578a;
    public int f27579b;
    public ValueAnimator.AnimatorUpdateListener f27580c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27580c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f27580c = null;
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
                jv0 jv0Var = jv0.this;
                int i11 = jv0Var.f27578a;
                if (i11 > 0 && (i10 = jv0Var.f27579b) > 0) {
                    int i12 = i11 - 1;
                    jv0Var.f27578a = i12;
                    if (jv0Var.f27580c != null) {
                        float[] fArr = jv0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = jv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = jv0Var.e;
                            float f7 = fArr2[0];
                            jv0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            jv0Var.f27580c.onAnimationUpdate(jv0Var);
                            return;
                        }
                        jv0Var.end();
                        return;
                    }
                    return;
                }
                jv0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.i0.f16175t);
        this.f27578a = duration;
        this.f27579b = duration;
        super.start();
    }
}
