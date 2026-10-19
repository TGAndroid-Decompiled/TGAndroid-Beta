package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class yw0 extends TimeAnimator {
    public int f32758a;
    public int f32759b;
    public ValueAnimator.AnimatorUpdateListener f32760c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f32760c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f32760c = null;
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
                int i11 = yw0Var.f32758a;
                if (i11 > 0 && (i10 = yw0Var.f32759b) > 0) {
                    int i12 = i11 - 1;
                    yw0Var.f32758a = i12;
                    if (yw0Var.f32760c != null) {
                        float[] fArr = yw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = yw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = yw0Var.e;
                            float f7 = fArr2[0];
                            yw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            yw0Var.f32760c.onAnimationUpdate(yw0Var);
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
        this.f32758a = duration;
        this.f32759b = duration;
        super.start();
    }
}
