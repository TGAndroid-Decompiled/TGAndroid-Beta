package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class su0 extends TimeAnimator {
    public int f39645a;
    public int f39646b;
    public ValueAnimator.AnimatorUpdateListener f39647c;
    public Float d;
    public float[] f39648e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39647c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f39647c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f39648e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                su0 su0Var = su0.this;
                int i10 = su0Var.f39645a;
                if (i10 > 0 && (i7 = su0Var.f39646b) > 0) {
                    int i11 = i10 - 1;
                    su0Var.f39645a = i11;
                    if (su0Var.f39647c != null) {
                        float[] fArr = su0Var.f39648e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = su0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = su0Var.f39648e;
                            float f10 = fArr2[0];
                            su0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            su0Var.f39647c.onAnimationUpdate(su0Var);
                            return;
                        }
                        su0Var.end();
                        return;
                    }
                    return;
                }
                su0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f24013t);
        this.f39645a = duration;
        this.f39646b = duration;
        super.start();
    }
}
