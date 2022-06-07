package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;

public class AnimatedFloat {
    private boolean firstSet;
    private View parent;
    private float startValue;
    private float targetValue;
    private boolean transition;
    private long transitionDelay;
    private long transitionDuration;
    private TimeInterpolator transitionInterpolator;
    private long transitionStart;
    private float value;

    public AnimatedFloat(long j, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = null;
        this.transitionDuration = j;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(long j, long j2, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = null;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(View view) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.firstSet = true;
    }

    public AnimatedFloat(View view, long j, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.transitionDuration = j;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(float f, View view, long j, long j2, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.targetValue = f;
        this.value = f;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = false;
    }

    public float get() {
        return this.value;
    }

    public float set(float f) {
        return set(f, false);
    }

    public float set(float f, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.firstSet) {
            this.targetValue = f;
            this.value = f;
            this.transition = false;
            this.firstSet = false;
        } else if (Math.abs(this.targetValue - f) > 1.0E-4f) {
            this.transition = true;
            this.targetValue = f;
            this.startValue = this.value;
            this.transitionStart = elapsedRealtime;
        }
        if (this.transition) {
            float clamp = MathUtils.clamp(((float) ((elapsedRealtime - this.transitionStart) - this.transitionDelay)) / ((float) this.transitionDuration), 0.0f, 1.0f);
            if (elapsedRealtime - this.transitionStart >= this.transitionDelay) {
                this.value = AndroidUtilities.lerp(this.startValue, this.targetValue, this.transitionInterpolator.getInterpolation(clamp));
            }
            if (clamp >= 1.0f) {
                this.transition = false;
            } else {
                View view = this.parent;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        return this.value;
    }

    public void setParent(View view) {
        this.parent = view;
    }
}
