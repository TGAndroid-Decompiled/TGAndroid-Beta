package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;

public class AnimatedColor {
    private boolean firstSet;
    private Runnable invalidate;
    private View parent;
    private int startValue;
    private int targetValue;
    private boolean transition;
    private long transitionDelay;
    private long transitionDuration;
    private TimeInterpolator transitionInterpolator;
    private long transitionStart;
    private int value;

    public AnimatedColor() {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = null;
        this.firstSet = true;
    }

    public int force(int i) {
        return set(i, true);
    }

    public int get() {
        return this.value;
    }

    public float getTransitionProgress() {
        if (this.transition) {
            return MathUtils.clamp(((SystemClock.elapsedRealtime() - this.transitionStart) - this.transitionDelay) / this.transitionDuration, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public float getTransitionProgressInterpolated() {
        TimeInterpolator timeInterpolator = this.transitionInterpolator;
        return timeInterpolator != null ? timeInterpolator.getInterpolation(getTransitionProgress()) : getTransitionProgress();
    }

    public int set(int i) {
        return set(i, false);
    }

    public void setParent(View view) {
        this.parent = view;
    }

    public int set(int i, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.transitionDuration <= 0 || this.firstSet) {
            this.targetValue = i;
            this.value = i;
            this.transition = false;
            this.firstSet = false;
        } else if (this.targetValue != i) {
            this.transition = true;
            this.targetValue = i;
            this.startValue = this.value;
            this.transitionStart = jElapsedRealtime;
        }
        if (this.transition) {
            float fClamp = MathUtils.clamp(((jElapsedRealtime - this.transitionStart) - this.transitionDelay) / this.transitionDuration, 0.0f, 1.0f);
            if (jElapsedRealtime - this.transitionStart >= this.transitionDelay) {
                TimeInterpolator timeInterpolator = this.transitionInterpolator;
                if (timeInterpolator == null) {
                    this.value = ColorUtils.blendARGB(fClamp, this.startValue, this.targetValue);
                } else {
                    this.value = ColorUtils.blendARGB(timeInterpolator.getInterpolation(fClamp), this.startValue, this.targetValue);
                }
            }
            if (fClamp >= 1.0f) {
                this.transition = false;
            } else {
                View view = this.parent;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.invalidate;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.value;
    }

    public AnimatedColor(long j, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = null;
        this.transitionDuration = j;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedColor(long j, long j2, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = null;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedColor(View view) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.firstSet = true;
    }

    public AnimatedColor(View view, long j, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.transitionDuration = j;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedColor(View view, long j, long j2, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedColor(Runnable runnable) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.firstSet = true;
    }

    public AnimatedColor(Runnable runnable, long j, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.transitionDuration = j;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = true;
    }

    public AnimatedColor(int i, View view) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.targetValue = i;
        this.value = i;
        this.firstSet = false;
    }

    public AnimatedColor(int i, Runnable runnable) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.targetValue = i;
        this.value = i;
        this.firstSet = false;
    }

    public AnimatedColor(int i, View view, long j, long j2, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.targetValue = i;
        this.value = i;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = false;
    }

    public AnimatedColor(int i, Runnable runnable, long j, long j2, TimeInterpolator timeInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.targetValue = i;
        this.value = i;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = timeInterpolator;
        this.firstSet = false;
    }
}
