package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class lv0 extends TimeAnimator {
    public int f30563a;
    public int f30564b;
    public ValueAnimator.AnimatorUpdateListener f30565c;
    public Float d;
    public float[] f30566e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f30565c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f30565c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f30566e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i9;
                lv0 lv0Var = lv0.this;
                int i10 = lv0Var.f30563a;
                if (i10 > 0 && (i9 = lv0Var.f30564b) > 0) {
                    int i11 = i10 - 1;
                    lv0Var.f30563a = i11;
                    if (lv0Var.f30565c != null) {
                        float[] fArr = lv0Var.f30566e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = lv0Var.getInterpolator().getInterpolation(1.0f - (i11 / i9));
                            float[] fArr2 = lv0Var.f30566e;
                            float f10 = fArr2[0];
                            lv0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            lv0Var.f30565c.onAnimationUpdate(lv0Var);
                            return;
                        }
                        lv0Var.end();
                        return;
                    }
                    return;
                }
                lv0Var.end();
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.f30563a = duration;
        this.f30564b = duration;
        super.start();
    }
}
