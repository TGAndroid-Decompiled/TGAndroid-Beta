package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gx0 extends TimeAnimator {
    public int f26891a;
    public int f26892b;
    public ValueAnimator.AnimatorUpdateListener f26893c;
    public Float d;
    public float[] f26894e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f26893c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f26893c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f26894e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                gx0 gx0Var = gx0.this;
                int i11 = gx0Var.f26891a;
                if (i11 > 0 && (i10 = gx0Var.f26892b) > 0) {
                    int i12 = i11 - 1;
                    gx0Var.f26891a = i12;
                    if (gx0Var.f26893c != null) {
                        float[] fArr = gx0Var.f26894e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = gx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = gx0Var.f26894e;
                            float f7 = fArr2[0];
                            gx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            gx0Var.f26893c.onAnimationUpdate(gx0Var);
                            return;
                        }
                        gx0Var.end();
                        return;
                    }
                    return;
                }
                gx0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f26891a = duration;
        this.f26892b = duration;
        super.start();
    }
}
