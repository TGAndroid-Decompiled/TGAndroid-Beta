package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class hu0 extends TimeAnimator {
    public int f35337a;
    public int f35338b;
    public ValueAnimator.AnimatorUpdateListener f35339c;
    public Float d;
    public float[] f35340e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f35339c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f35339c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f35340e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                hu0 hu0Var = hu0.this;
                int i10 = hu0Var.f35337a;
                if (i10 > 0 && (i7 = hu0Var.f35338b) > 0) {
                    int i11 = i10 - 1;
                    hu0Var.f35337a = i11;
                    if (hu0Var.f35339c != null) {
                        float[] fArr = hu0Var.f35340e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = hu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = hu0Var.f35340e;
                            float f10 = fArr2[0];
                            hu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            hu0Var.f35339c.onAnimationUpdate(hu0Var);
                            return;
                        }
                        hu0Var.end();
                        return;
                    }
                    return;
                }
                hu0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f23614t);
        this.f35337a = duration;
        this.f35338b = duration;
        super.start();
    }
}
