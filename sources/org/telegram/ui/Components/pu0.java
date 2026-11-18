package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class pu0 extends TimeAnimator {
    public int f38562a;
    public int f38563b;
    public ValueAnimator.AnimatorUpdateListener f38564c;
    public Float d;
    public float[] f38565e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38564c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f38564c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f38565e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                pu0 pu0Var = pu0.this;
                int i10 = pu0Var.f38562a;
                if (i10 > 0 && (i7 = pu0Var.f38563b) > 0) {
                    int i11 = i10 - 1;
                    pu0Var.f38562a = i11;
                    if (pu0Var.f38564c != null) {
                        float[] fArr = pu0Var.f38565e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = pu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = pu0Var.f38565e;
                            float f10 = fArr2[0];
                            pu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            pu0Var.f38564c.onAnimationUpdate(pu0Var);
                            return;
                        }
                        pu0Var.end();
                        return;
                    }
                    return;
                }
                pu0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f24121t);
        this.f38562a = duration;
        this.f38563b = duration;
        super.start();
    }
}
