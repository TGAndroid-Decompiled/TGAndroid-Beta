package org.telegram.ui.Components;

import android.os.SystemClock;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;

public final class AnimatedColor {
    public boolean firstSet;
    public final Runnable invalidate;
    public final View parent;
    public int startValue;
    public int targetValue;
    public boolean transition;
    public final long transitionDuration;
    public final CubicBezierInterpolator transitionInterpolator;
    public long transitionStart;
    public int value;

    public AnimatedColor(View view) {
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.firstSet = true;
    }

    public final int set(int i, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.transitionDuration;
        if (z || j <= 0 || this.firstSet) {
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
            float fClamp = MathUtils.clamp((jElapsedRealtime - this.transitionStart) / j, 0.0f, 1.0f);
            if (jElapsedRealtime - this.transitionStart >= 0) {
                CubicBezierInterpolator cubicBezierInterpolator = this.transitionInterpolator;
                if (cubicBezierInterpolator == null) {
                    this.value = ColorUtils.blendARGB(fClamp, this.startValue, this.targetValue);
                } else {
                    this.value = ColorUtils.blendARGB(cubicBezierInterpolator.getInterpolation(fClamp), this.startValue, this.targetValue);
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

    public AnimatedColor(View view, long j, CubicBezierInterpolator cubicBezierInterpolator) {
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.transitionDuration = j;
        this.transitionInterpolator = cubicBezierInterpolator;
        this.firstSet = true;
    }

    public AnimatedColor(View view, long j, CubicBezierInterpolator cubicBezierInterpolator, int i) {
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.transitionDuration = j;
        this.transitionInterpolator = cubicBezierInterpolator;
        this.firstSet = true;
    }

    public AnimatedColor(Runnable runnable, long j, CubicBezierInterpolator cubicBezierInterpolator) {
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.transitionDuration = j;
        this.transitionInterpolator = cubicBezierInterpolator;
        this.firstSet = true;
    }
}
