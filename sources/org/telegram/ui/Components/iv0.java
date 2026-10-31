package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class iv0 extends TimeAnimator {
    public int f27105a;
    public int f27106b;
    public ValueAnimator.AnimatorUpdateListener f27107c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27107c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f27107c = null;
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
                iv0 iv0Var = iv0.this;
                int i11 = iv0Var.f27105a;
                if (i11 > 0 && (i10 = iv0Var.f27106b) > 0) {
                    int i12 = i11 - 1;
                    iv0Var.f27105a = i12;
                    if (iv0Var.f27107c != null) {
                        float[] fArr = iv0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = iv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = iv0Var.e;
                            float f7 = fArr2[0];
                            iv0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            iv0Var.f27107c.onAnimationUpdate(iv0Var);
                            return;
                        }
                        iv0Var.end();
                        return;
                    }
                    return;
                }
                iv0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.i0.f16029t);
        this.f27105a = duration;
        this.f27106b = duration;
        super.start();
    }
}
