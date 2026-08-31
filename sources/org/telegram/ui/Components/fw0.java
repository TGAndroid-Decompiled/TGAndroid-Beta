package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class fw0 extends TimeAnimator {
    public int f27027a;
    public int f27028b;
    public ValueAnimator.AnimatorUpdateListener f27029c;
    public Float d;
    public float[] f27030e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27029c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f27029c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f27030e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                fw0 fw0Var = fw0.this;
                int i11 = fw0Var.f27027a;
                if (i11 > 0 && (i10 = fw0Var.f27028b) > 0) {
                    int i12 = i11 - 1;
                    fw0Var.f27027a = i12;
                    if (fw0Var.f27029c != null) {
                        float[] fArr = fw0Var.f27030e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = fw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = fw0Var.f27030e;
                            float f10 = fArr2[0];
                            fw0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            fw0Var.f27029c.onAnimationUpdate(fw0Var);
                            return;
                        }
                        fw0Var.end();
                        return;
                    }
                    return;
                }
                fw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f27027a = duration;
        this.f27028b = duration;
        super.start();
    }
}
