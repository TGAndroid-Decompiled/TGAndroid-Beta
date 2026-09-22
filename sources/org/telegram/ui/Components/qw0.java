package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qw0 extends TimeAnimator {
    public int f27684a;
    public int f27685b;
    public ValueAnimator.AnimatorUpdateListener f27686c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27686c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f27686c = null;
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
                qw0 qw0Var = qw0.this;
                int i11 = qw0Var.f27684a;
                if (i11 > 0 && (i10 = qw0Var.f27685b) > 0) {
                    int i12 = i11 - 1;
                    qw0Var.f27684a = i12;
                    if (qw0Var.f27686c != null) {
                        float[] fArr = qw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = qw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = qw0Var.e;
                            float f7 = fArr2[0];
                            qw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            qw0Var.f27686c.onAnimationUpdate(qw0Var);
                            return;
                        }
                        qw0Var.end();
                        return;
                    }
                    return;
                }
                qw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f27684a = duration;
        this.f27685b = duration;
        super.start();
    }
}
