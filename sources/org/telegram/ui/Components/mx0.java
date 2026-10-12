package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class mx0 extends TimeAnimator {
    public int f28661a;
    public int f28662b;
    public ValueAnimator.AnimatorUpdateListener f28663c;
    public Float d;
    public float[] f28664e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f28663c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f28663c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f28664e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                mx0 mx0Var = mx0.this;
                int i11 = mx0Var.f28661a;
                if (i11 > 0 && (i10 = mx0Var.f28662b) > 0) {
                    int i12 = i11 - 1;
                    mx0Var.f28661a = i12;
                    if (mx0Var.f28663c != null) {
                        float[] fArr = mx0Var.f28664e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = mx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = mx0Var.f28664e;
                            float f7 = fArr2[0];
                            mx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            mx0Var.f28663c.onAnimationUpdate(mx0Var);
                            return;
                        }
                        mx0Var.end();
                        return;
                    }
                    return;
                }
                mx0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f28661a = duration;
        this.f28662b = duration;
        super.start();
    }
}
