package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class bx0 extends TimeAnimator {
    public int f25109a;
    public int f25110b;
    public ValueAnimator.AnimatorUpdateListener f25111c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25111c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f25111c = null;
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
                bx0 bx0Var = bx0.this;
                int i11 = bx0Var.f25109a;
                if (i11 > 0 && (i10 = bx0Var.f25110b) > 0) {
                    int i12 = i11 - 1;
                    bx0Var.f25109a = i12;
                    if (bx0Var.f25111c != null) {
                        float[] fArr = bx0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = bx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = bx0Var.e;
                            float f7 = fArr2[0];
                            bx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            bx0Var.f25111c.onAnimationUpdate(bx0Var);
                            return;
                        }
                        bx0Var.end();
                        return;
                    }
                    return;
                }
                bx0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f25109a = duration;
        this.f25110b = duration;
        super.start();
    }
}
