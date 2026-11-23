package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class ru0 extends TimeAnimator {
    public int f39408a;
    public int f39409b;
    public ValueAnimator.AnimatorUpdateListener f39410c;
    public Float d;
    public float[] f39411e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39410c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f39410c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f39411e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                ru0 ru0Var = ru0.this;
                int i10 = ru0Var.f39408a;
                if (i10 > 0 && (i7 = ru0Var.f39409b) > 0) {
                    int i11 = i10 - 1;
                    ru0Var.f39408a = i11;
                    if (ru0Var.f39410c != null) {
                        float[] fArr = ru0Var.f39411e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = ru0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = ru0Var.f39411e;
                            float f10 = fArr2[0];
                            ru0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            ru0Var.f39410c.onAnimationUpdate(ru0Var);
                            return;
                        }
                        ru0Var.end();
                        return;
                    }
                    return;
                }
                ru0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f24229t);
        this.f39408a = duration;
        this.f39409b = duration;
        super.start();
    }
}
