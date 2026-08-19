package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public class StableAnimator extends TimeAnimator {
    private Object animatedValue;
    private float[] floatValues;
    private int times = 0;
    private int totalTimes = 0;
    private ValueAnimator.AnimatorUpdateListener updateListener;

    public static StableAnimator ofFloat(float... fArr) {
        StableAnimator stableAnimator = new StableAnimator();
        stableAnimator.setFloatValues(fArr);
        return stableAnimator;
    }

    @Override
    public void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.floatValues = fArr;
    }

    @Override
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.updateListener = animatorUpdateListener;
    }

    @Override
    public Object getAnimatedValue() {
        return this.animatedValue;
    }

    @Override
    public void end() {
        this.updateListener = null;
        super.end();
    }

    @Override
    public void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                StableAnimator.m2819$r8$lambda$JW24i3o97WzNdDy57JetywWaRA(this.f$0, timeAnimator, j, j2);
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.times = duration;
        this.totalTimes = duration;
        super.start();
    }

    public static void m2819$r8$lambda$JW24i3o97WzNdDy57JetywWaRA(StableAnimator stableAnimator, TimeAnimator timeAnimator, long j, long j2) {
        int i;
        int i2 = stableAnimator.times;
        if (i2 > 0 && (i = stableAnimator.totalTimes) > 0) {
            int i3 = i2 - 1;
            stableAnimator.times = i3;
            if (stableAnimator.updateListener != null) {
                float[] fArr = stableAnimator.floatValues;
                if (fArr != null && fArr.length == 2) {
                    float interpolation = stableAnimator.getInterpolator().getInterpolation(1.0f - (i3 / i));
                    float[] fArr2 = stableAnimator.floatValues;
                    float f = fArr2[0];
                    stableAnimator.animatedValue = Float.valueOf(f + ((fArr2[1] - f) * interpolation));
                    stableAnimator.updateListener.onAnimationUpdate(stableAnimator);
                    return;
                }
                stableAnimator.end();
                return;
            }
            return;
        }
        stableAnimator.end();
    }
}
