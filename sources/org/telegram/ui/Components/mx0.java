package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class mx0 extends TimeAnimator {
    public int f28672a;
    public int f28673b;
    public ValueAnimator.AnimatorUpdateListener f28674c;
    public Float d;
    public float[] f28675e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f28674c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f28674c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f28675e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                mx0 mx0Var = mx0.this;
                int i11 = mx0Var.f28672a;
                if (i11 > 0 && (i10 = mx0Var.f28673b) > 0) {
                    int i12 = i11 - 1;
                    mx0Var.f28672a = i12;
                    if (mx0Var.f28674c != null) {
                        float[] fArr = mx0Var.f28675e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = mx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = mx0Var.f28675e;
                            float f7 = fArr2[0];
                            mx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            mx0Var.f28674c.onAnimationUpdate(mx0Var);
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
        this.f28672a = duration;
        this.f28673b = duration;
        super.start();
    }
}
