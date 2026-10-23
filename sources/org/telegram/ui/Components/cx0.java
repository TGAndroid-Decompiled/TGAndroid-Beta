package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class cx0 extends TimeAnimator {
    public int f25447a;
    public int f25448b;
    public ValueAnimator.AnimatorUpdateListener f25449c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25449c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f25449c = null;
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
                int i11 = cx0Var.f25447a;
                if (i11 > 0 && (i10 = cx0Var.f25448b) > 0) {
                    int i12 = i11 - 1;
                    cx0Var.f25447a = i12;
                    if (cx0Var.f25449c != null) {
                        float[] fArr = cx0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = cx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = cx0Var.e;
                            float f7 = fArr2[0];
                            cx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            cx0Var.f25449c.onAnimationUpdate(cx0Var);
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
        this.f25447a = duration;
        this.f25448b = duration;
        super.start();
    }
}
