package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pw0 extends TimeAnimator {
    public int f27330a;
    public int f27331b;
    public ValueAnimator.AnimatorUpdateListener f27332c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27332c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f27332c = null;
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
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                pw0 pw0Var = pw0.this;
                int i11 = pw0Var.f27330a;
                if (i11 > 0 && (i10 = pw0Var.f27331b) > 0) {
                    int i12 = i11 - 1;
                    pw0Var.f27330a = i12;
                    if (pw0Var.f27332c != null) {
                        float[] fArr = pw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = pw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = pw0Var.e;
                            float f7 = fArr2[0];
                            pw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            pw0Var.f27332c.onAnimationUpdate(pw0Var);
                            return;
                        }
                        pw0Var.end();
                        return;
                    }
                    return;
                }
                pw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f27330a = duration;
        this.f27331b = duration;
        super.start();
    }
}
