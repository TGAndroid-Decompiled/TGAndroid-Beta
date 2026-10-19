package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class yw0 extends TimeAnimator {
    public int f32756a;
    public int f32757b;
    public ValueAnimator.AnimatorUpdateListener f32758c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f32758c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f32758c = null;
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
                yw0 yw0Var = yw0.this;
                int i11 = yw0Var.f32756a;
                if (i11 > 0 && (i10 = yw0Var.f32757b) > 0) {
                    int i12 = i11 - 1;
                    yw0Var.f32756a = i12;
                    if (yw0Var.f32758c != null) {
                        float[] fArr = yw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = yw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = yw0Var.e;
                            float f7 = fArr2[0];
                            yw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            yw0Var.f32758c.onAnimationUpdate(yw0Var);
                            return;
                        }
                        yw0Var.end();
                        return;
                    }
                    return;
                }
                yw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f32756a = duration;
        this.f32757b = duration;
        super.start();
    }
}
