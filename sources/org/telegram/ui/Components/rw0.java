package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rw0 extends TimeAnimator {
    public int f28137a;
    public int f28138b;
    public ValueAnimator.AnimatorUpdateListener f28139c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f28139c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f28139c = null;
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
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                rw0 rw0Var = rw0.this;
                int i11 = rw0Var.f28137a;
                if (i11 > 0 && (i10 = rw0Var.f28138b) > 0) {
                    int i12 = i11 - 1;
                    rw0Var.f28137a = i12;
                    if (rw0Var.f28139c != null) {
                        float[] fArr = rw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = rw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = rw0Var.e;
                            float f7 = fArr2[0];
                            rw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            rw0Var.f28139c.onAnimationUpdate(rw0Var);
                            return;
                        }
                        rw0Var.end();
                        return;
                    }
                    return;
                }
                rw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f28137a = duration;
        this.f28138b = duration;
        super.start();
    }
}
