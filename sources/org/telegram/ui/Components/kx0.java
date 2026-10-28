package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class kx0 extends TimeAnimator {
    public int f30047a;
    public int f30048b;
    public ValueAnimator.AnimatorUpdateListener f30049c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f30049c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f30049c = null;
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
                kx0 kx0Var = kx0.this;
                int i11 = kx0Var.f30047a;
                if (i11 > 0 && (i10 = kx0Var.f30048b) > 0) {
                    int i12 = i11 - 1;
                    kx0Var.f30047a = i12;
                    if (kx0Var.f30049c != null) {
                        float[] fArr = kx0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = kx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = kx0Var.e;
                            float f7 = fArr2[0];
                            kx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            kx0Var.f30049c.onAnimationUpdate(kx0Var);
                            return;
                        }
                        kx0Var.end();
                        return;
                    }
                    return;
                }
                kx0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f30047a = duration;
        this.f30048b = duration;
        super.start();
    }
}
