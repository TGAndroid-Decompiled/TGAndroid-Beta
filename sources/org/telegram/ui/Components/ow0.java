package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ow0 extends TimeAnimator {
    public int f25925a;
    public int f25926b;
    public ValueAnimator.AnimatorUpdateListener f25927c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25927c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f25927c = null;
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
                ow0 ow0Var = ow0.this;
                int i11 = ow0Var.f25925a;
                if (i11 > 0 && (i10 = ow0Var.f25926b) > 0) {
                    int i12 = i11 - 1;
                    ow0Var.f25925a = i12;
                    if (ow0Var.f25927c != null) {
                        float[] fArr = ow0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = ow0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = ow0Var.e;
                            float f7 = fArr2[0];
                            ow0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            ow0Var.f25927c.onAnimationUpdate(ow0Var);
                            return;
                        }
                        ow0Var.end();
                        return;
                    }
                    return;
                }
                ow0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f25925a = duration;
        this.f25926b = duration;
        super.start();
    }
}
