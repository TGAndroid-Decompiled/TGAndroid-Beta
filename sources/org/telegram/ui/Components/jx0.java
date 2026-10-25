package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class jx0 extends TimeAnimator {
    public int f29728a;
    public int f29729b;
    public ValueAnimator.AnimatorUpdateListener f29730c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f29730c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f29730c = null;
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
                jx0 jx0Var = jx0.this;
                int i11 = jx0Var.f29728a;
                if (i11 > 0 && (i10 = jx0Var.f29729b) > 0) {
                    int i12 = i11 - 1;
                    jx0Var.f29728a = i12;
                    if (jx0Var.f29730c != null) {
                        float[] fArr = jx0Var.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = jx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = jx0Var.e;
                            float f7 = fArr2[0];
                            jx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                            jx0Var.f29730c.onAnimationUpdate(jx0Var);
                            return;
                        }
                        jx0Var.end();
                        return;
                    }
                    return;
                }
                jx0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f29728a = duration;
        this.f29729b = duration;
        super.start();
    }
}
