package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class StableAnimator extends TimeAnimator {
    public Float animatedValue;
    public float[] floatValues;
    public int times;
    public int totalTimes;
    public ValueAnimator.AnimatorUpdateListener updateListener;

    public static StableAnimator ofFloat(float... fArr) {
        StableAnimator stableAnimator = new StableAnimator();
        stableAnimator.times = 0;
        stableAnimator.totalTimes = 0;
        super.setFloatValues(fArr);
        stableAnimator.floatValues = fArr;
        return stableAnimator;
    }

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.updateListener = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.updateListener = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.animatedValue;
    }

    public final void lambda$start$0() {
        int i;
        int i2 = this.times;
        if (i2 <= 0 || (i = this.totalTimes) <= 0) {
            this.updateListener = null;
            super.end();
            return;
        }
        int i3 = i2 - 1;
        this.times = i3;
        if (this.updateListener != null) {
            float[] fArr = this.floatValues;
            if (fArr == null || fArr.length != 2) {
                this.updateListener = null;
                super.end();
                return;
            }
            float interpolation = getInterpolator().getInterpolation(1.0f - (i3 / i));
            float[] fArr2 = this.floatValues;
            float f = fArr2[0];
            this.animatedValue = Float.valueOf(((fArr2[1] - f) * interpolation) + f);
            this.updateListener.onAnimationUpdate(this);
        }
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.floatValues = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                this.f$0.lambda$start$0();
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.times = duration;
        this.totalTimes = duration;
        super.start();
    }
}
