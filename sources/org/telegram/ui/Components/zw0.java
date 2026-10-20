package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class zw0 extends TimeAnimator {
    public int f33048a;
    public int f33049b;
    public ValueAnimator.AnimatorUpdateListener f33050c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f33050c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f33050c = null;
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
                zw0 zw0Var = zw0.this;
                int i11 = zw0Var.f33048a;
                if (i11 > 0 && (i10 = zw0Var.f33049b) > 0) {
                    int i12 = i11 - 1;
                    zw0Var.f33048a = i12;
                    if (zw0Var.f33050c != null) {
                        float[] fArr = zw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = zw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = zw0Var.e;
                            float f7 = fArr2[0];
                            zw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            zw0Var.f33050c.onAnimationUpdate(zw0Var);
                            return;
                        }
                        zw0Var.end();
                        return;
                    }
                    return;
                }
                zw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f33048a = duration;
        this.f33049b = duration;
        super.start();
    }
}
