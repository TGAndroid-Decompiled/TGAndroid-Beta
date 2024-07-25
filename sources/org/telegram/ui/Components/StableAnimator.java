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
                StableAnimator.this.lambda$start$0(timeAnimator, j, j2);
            }
        });
        int duration = (int) (((float) getDuration()) / AndroidUtilities.screenRefreshTime);
        this.times = duration;
        this.totalTimes = duration;
        super.start();
    }

    public void lambda$start$0(TimeAnimator timeAnimator, long j, long j2) {
        int i;
        int i2 = this.times;
        if (i2 > 0 && (i = this.totalTimes) > 0) {
            int i3 = i2 - 1;
            this.times = i3;
            if (this.updateListener != null) {
                float[] fArr = this.floatValues;
                if (fArr != null && fArr.length == 2) {
                    float interpolation = getInterpolator().getInterpolation(1.0f - (i3 / i));
                    float[] fArr2 = this.floatValues;
                    this.animatedValue = Float.valueOf(fArr2[0] + ((fArr2[1] - fArr2[0]) * interpolation));
                    this.updateListener.onAnimationUpdate(this);
                    return;
                }
                end();
                return;
            }
            return;
        }
        end();
    }
}
