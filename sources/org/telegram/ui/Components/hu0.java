package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class hu0 extends TimeAnimator {
    public int f35346a;
    public int f35347b;
    public ValueAnimator.AnimatorUpdateListener f35348c;
    public Float d;
    public float[] f35349e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f35348c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f35348c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f35349e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                hu0 hu0Var = hu0.this;
                int i10 = hu0Var.f35346a;
                if (i10 > 0 && (i7 = hu0Var.f35347b) > 0) {
                    int i11 = i10 - 1;
                    hu0Var.f35346a = i11;
                    if (hu0Var.f35348c != null) {
                        float[] fArr = hu0Var.f35349e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = hu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                            float[] fArr2 = hu0Var.f35349e;
                            float f10 = fArr2[0];
                            hu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            hu0Var.f35348c.onAnimationUpdate(hu0Var);
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
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f23612t);
        this.f35346a = duration;
        this.f35347b = duration;
        super.start();
    }
}
