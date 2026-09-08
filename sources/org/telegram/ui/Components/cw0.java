package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class cw0 extends TimeAnimator {
    public int f25127a;
    public int f25128b;
    public ValueAnimator.AnimatorUpdateListener f25129c;
    public Float d;
    public float[] f25130e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25129c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f25129c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f25130e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                cw0 cw0Var = cw0.this;
                int i11 = cw0Var.f25127a;
                if (i11 > 0 && (i10 = cw0Var.f25128b) > 0) {
                    int i12 = i11 - 1;
                    cw0Var.f25127a = i12;
                    if (cw0Var.f25129c != null) {
                        float[] fArr = cw0Var.f25130e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = cw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = cw0Var.f25130e;
                            float f7 = fArr2[0];
                            cw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            cw0Var.f25129c.onAnimationUpdate(cw0Var);
                            return;
                        }
                        cw0Var.end();
                        return;
                    }
                    return;
                }
                cw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f25127a = duration;
        this.f25128b = duration;
        super.start();
    }
}
