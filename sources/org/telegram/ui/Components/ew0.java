package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ew0 extends TimeAnimator {
    public int f23680a;
    public int f23681b;
    public ValueAnimator.AnimatorUpdateListener f23682c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f23682c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f23682c = null;
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
                ew0 ew0Var = ew0.this;
                int i11 = ew0Var.f23680a;
                if (i11 > 0 && (i10 = ew0Var.f23681b) > 0) {
                    int i12 = i11 - 1;
                    ew0Var.f23680a = i12;
                    if (ew0Var.f23682c != null) {
                        float[] fArr = ew0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = ew0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = ew0Var.e;
                            float f7 = fArr2[0];
                            ew0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            ew0Var.f23682c.onAnimationUpdate(ew0Var);
                            return;
                        }
                        ew0Var.end();
                        return;
                    }
                    return;
                }
                ew0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f23680a = duration;
        this.f23681b = duration;
        super.start();
    }
}
