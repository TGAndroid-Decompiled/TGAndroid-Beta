package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ax0 extends TimeAnimator {
    public int f24755a;
    public int f24756b;
    public ValueAnimator.AnimatorUpdateListener f24757c;
    public Float d;
    public float[] f24758e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f24757c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f24757c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f24758e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                ax0 ax0Var = ax0.this;
                int i11 = ax0Var.f24755a;
                if (i11 > 0 && (i10 = ax0Var.f24756b) > 0) {
                    int i12 = i11 - 1;
                    ax0Var.f24755a = i12;
                    if (ax0Var.f24757c != null) {
                        float[] fArr = ax0Var.f24758e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = ax0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = ax0Var.f24758e;
                            float f7 = fArr2[0];
                            ax0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            ax0Var.f24757c.onAnimationUpdate(ax0Var);
                            return;
                        }
                        ax0Var.end();
                        return;
                    }
                    return;
                }
                ax0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f24755a = duration;
        this.f24756b = duration;
        super.start();
    }
}
