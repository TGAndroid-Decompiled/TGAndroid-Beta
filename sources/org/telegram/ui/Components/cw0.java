package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class cw0 extends TimeAnimator {
    public int f25100a;
    public int f25101b;
    public ValueAnimator.AnimatorUpdateListener f25102c;
    public Float d;
    public float[] f25103e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25102c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f25102c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f25103e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                cw0 cw0Var = cw0.this;
                int i11 = cw0Var.f25100a;
                if (i11 > 0 && (i10 = cw0Var.f25101b) > 0) {
                    int i12 = i11 - 1;
                    cw0Var.f25100a = i12;
                    if (cw0Var.f25102c != null) {
                        float[] fArr = cw0Var.f25103e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = cw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = cw0Var.f25103e;
                            float f7 = fArr2[0];
                            cw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            cw0Var.f25102c.onAnimationUpdate(cw0Var);
                            return;
                        }
                        cw0Var.end();
                        return;
                    }
                    return;
                }
                cw0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f25100a = duration;
        this.f25101b = duration;
        super.start();
    }
}
