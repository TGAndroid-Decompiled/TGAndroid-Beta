package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class iu0 extends TimeAnimator {
    public int f34859a;
    public int f34860b;
    public ValueAnimator.AnimatorUpdateListener f34861c;
    public Float d;
    public float[] f34862e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f34861c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f34861c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f34862e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                iu0 iu0Var = iu0.this;
                int i10 = iu0Var.f34859a;
                if (i10 > 0 && (i7 = iu0Var.f34860b) > 0) {
                    int i11 = i10 - 1;
                    iu0Var.f34859a = i11;
                    if (iu0Var.f34861c != null) {
                        float[] fArr = iu0Var.f34862e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = iu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = iu0Var.f34862e;
                            float f10 = fArr2[0];
                            iu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            iu0Var.f34861c.onAnimationUpdate(iu0Var);
                            return;
                        }
                        iu0Var.end();
                        return;
                    }
                    return;
                }
                iu0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f22566t);
        this.f34859a = duration;
        this.f34860b = duration;
        super.start();
    }
}
