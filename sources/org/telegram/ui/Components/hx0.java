package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class hx0 extends TimeAnimator {
    public int f27159a;
    public int f27160b;
    public ValueAnimator.AnimatorUpdateListener f27161c;
    public Float d;
    public float[] f27162e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27161c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f27161c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f27162e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                hx0 hx0Var = hx0.this;
                int i11 = hx0Var.f27159a;
                if (i11 > 0 && (i10 = hx0Var.f27160b) > 0) {
                    int i12 = i11 - 1;
                    hx0Var.f27159a = i12;
                    if (hx0Var.f27161c != null) {
                        float[] fArr = hx0Var.f27162e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = hx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = hx0Var.f27162e;
                            float f7 = fArr2[0];
                            hx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            hx0Var.f27161c.onAnimationUpdate(hx0Var);
                            return;
                        }
                        hx0Var.end();
                        return;
                    }
                    return;
                }
                hx0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f27159a = duration;
        this.f27160b = duration;
        super.start();
    }
}
