package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class cx0 extends TimeAnimator {
    public int f23906a;
    public int f23907b;
    public ValueAnimator.AnimatorUpdateListener f23908c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f23908c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f23908c = null;
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
                cx0 cx0Var = cx0.this;
                int i11 = cx0Var.f23906a;
                if (i11 > 0 && (i10 = cx0Var.f23907b) > 0) {
                    int i12 = i11 - 1;
                    cx0Var.f23906a = i12;
                    if (cx0Var.f23908c != null) {
                        float[] fArr = cx0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = cx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = cx0Var.e;
                            float f7 = fArr2[0];
                            cx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            cx0Var.f23908c.onAnimationUpdate(cx0Var);
                            return;
                        }
                        cx0Var.end();
                        return;
                    }
                    return;
                }
                cx0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f23906a = duration;
        this.f23907b = duration;
        super.start();
    }
}
