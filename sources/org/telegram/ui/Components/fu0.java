package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class fu0 extends TimeAnimator {
    public int f33867a;
    public int f33868b;
    public ValueAnimator.AnimatorUpdateListener f33869c;
    public Float d;
    public float[] f33870e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f33869c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f33869c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f33870e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i3;
                fu0 fu0Var = fu0.this;
                int i10 = fu0Var.f33867a;
                if (i10 > 0 && (i3 = fu0Var.f33868b) > 0) {
                    int i11 = i10 - 1;
                    fu0Var.f33867a = i11;
                    if (fu0Var.f33869c != null) {
                        float[] fArr = fu0Var.f33870e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = fu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i3));
                            float[] fArr2 = fu0Var.f33870e;
                            float f10 = fArr2[0];
                            fu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            fu0Var.f33869c.onAnimationUpdate(fu0Var);
                            return;
                        }
                        fu0Var.end();
                        return;
                    }
                    return;
                }
                fu0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / org.telegram.messenger.g0.f22611t);
        this.f33867a = duration;
        this.f33868b = duration;
        super.start();
    }
}
