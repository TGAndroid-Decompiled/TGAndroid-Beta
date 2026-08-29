package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class vv0 extends TimeAnimator {
    public int f34184a;
    public int f34185b;
    public ValueAnimator.AnimatorUpdateListener f34186c;
    public Float d;
    public float[] f34187e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f34186c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f34186c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f34187e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                vv0 vv0Var = vv0.this;
                int i11 = vv0Var.f34184a;
                if (i11 > 0 && (i10 = vv0Var.f34185b) > 0) {
                    int i12 = i11 - 1;
                    vv0Var.f34184a = i12;
                    if (vv0Var.f34186c != null) {
                        float[] fArr = vv0Var.f34187e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = vv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = vv0Var.f34187e;
                            float f9 = fArr2[0];
                            vv0Var.d = Float.valueOf(((fArr2[1] - f9) * interpolation) + f9);
                            vv0Var.f34186c.onAnimationUpdate(vv0Var);
                            return;
                        }
                        vv0Var.end();
                        return;
                    }
                    return;
                }
                vv0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f34184a = duration;
        this.f34185b = duration;
        super.start();
    }
}
