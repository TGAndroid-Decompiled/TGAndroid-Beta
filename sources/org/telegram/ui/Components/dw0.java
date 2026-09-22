package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class dw0 extends TimeAnimator {
    public int f23400a;
    public int f23401b;
    public ValueAnimator.AnimatorUpdateListener f23402c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f23402c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f23402c = null;
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
                dw0 dw0Var = dw0.this;
                int i11 = dw0Var.f23400a;
                if (i11 > 0 && (i10 = dw0Var.f23401b) > 0) {
                    int i12 = i11 - 1;
                    dw0Var.f23400a = i12;
                    if (dw0Var.f23402c != null) {
                        float[] fArr = dw0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = dw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = dw0Var.e;
                            float f7 = fArr2[0];
                            dw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            dw0Var.f23402c.onAnimationUpdate(dw0Var);
                            return;
                        }
                        dw0Var.end();
                        return;
                    }
                    return;
                }
                dw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f23400a = duration;
        this.f23401b = duration;
        super.start();
    }
}
