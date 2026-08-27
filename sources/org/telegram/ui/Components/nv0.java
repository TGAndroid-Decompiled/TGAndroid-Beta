package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class nv0 extends TimeAnimator {

    public int f31037a;

    public int f31038b;

    public ValueAnimator.AnimatorUpdateListener f31039c;
    public Float d;

    public float[] f31040e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31039c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f31039c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f31040e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                nv0 nv0Var = this.f30760a;
                int i11 = nv0Var.f31037a;
                if (i11 <= 0 || (i10 = nv0Var.f31038b) <= 0) {
                    nv0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                nv0Var.f31037a = i12;
                if (nv0Var.f31039c != null) {
                    float[] fArr = nv0Var.f31040e;
                    if (fArr == null || fArr.length != 2) {
                        nv0Var.end();
                        return;
                    }
                    float interpolation = nv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = nv0Var.f31040e;
                    float f10 = fArr2[0];
                    nv0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    nv0Var.f31039c.onAnimationUpdate(nv0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.f31037a = duration;
        this.f31038b = duration;
        super.start();
    }
}
