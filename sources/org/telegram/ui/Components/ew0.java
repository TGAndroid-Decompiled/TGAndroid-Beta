package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ew0 extends TimeAnimator {
    public int f26685a;
    public int f26686b;
    public ValueAnimator.AnimatorUpdateListener f26687c;
    public Float d;
    public float[] f26688e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f26687c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.f26687c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.f26688e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                ew0 ew0Var = ew0.this;
                int i11 = ew0Var.f26685a;
                if (i11 > 0 && (i10 = ew0Var.f26686b) > 0) {
                    int i12 = i11 - 1;
                    ew0Var.f26685a = i12;
                    if (ew0Var.f26687c != null) {
                        float[] fArr = ew0Var.f26688e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = ew0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                            float[] fArr2 = ew0Var.f26688e;
                            float f10 = fArr2[0];
                            ew0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                            ew0Var.f26687c.onAnimationUpdate(ew0Var);
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
        this.f26685a = duration;
        this.f26686b = duration;
        super.start();
    }
}
