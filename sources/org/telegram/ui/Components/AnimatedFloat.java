package org.telegram.ui.Components;

import android.os.SystemClock;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AnimatedFloat {
    public boolean firstSet;
    public final Runnable invalidate;
    public View parent;
    public float startValue;
    public float targetValue;
    public boolean transition;
    public long transitionDelay;
    public long transitionDuration;
    public final Interpolator transitionInterpolator;
    public long transitionStart;
    public float value;

    public AnimatedFloat(long j, Interpolator interpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = null;
        this.transitionDuration = j;
        this.transitionInterpolator = interpolator;
        this.firstSet = true;
    }

    public final void force(boolean z) {
        set(z ? 1.0f : 0.0f, true);
    }

    public final float getValue() {
        if (this.transition) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            float fClamp = MathUtils.clamp(((jElapsedRealtime - this.transitionStart) - this.transitionDelay) / this.transitionDuration, 0.0f, 1.0f);
            if (jElapsedRealtime - this.transitionStart >= this.transitionDelay) {
                Interpolator interpolator = this.transitionInterpolator;
                if (interpolator == null) {
                    this.value = AndroidUtilities.lerp(this.startValue, this.targetValue, fClamp);
                } else {
                    this.value = AndroidUtilities.lerp(this.startValue, this.targetValue, interpolator.getInterpolation(fClamp));
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

    public final float set(boolean z) {
        return set(z ? 1.0f : 0.0f, false);
    }

    public final float set(boolean z, boolean z2) {
        return set(z ? 1.0f : 0.0f, z2);
    }

    public final float set(float f, boolean z) {
        if (z || this.transitionDuration <= 0 || this.firstSet) {
            this.targetValue = f;
            this.value = f;
            this.transition = false;
            this.firstSet = false;
        } else if (Math.abs(this.targetValue - f) > 1.0E-4f) {
            this.transition = true;
            this.targetValue = f;
            this.startValue = this.value;
            this.transitionStart = SystemClock.elapsedRealtime();
        }
        return getValue();
    }

    public AnimatedFloat(long j, long j2, CubicBezierInterpolator cubicBezierInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        this.parent = null;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = cubicBezierInterpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(View view) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.firstSet = true;
    }

    public AnimatedFloat(long j, View view, Interpolator interpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.transitionDuration = j;
        this.transitionInterpolator = interpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(View view, long j, long j2, Interpolator interpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = interpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(Runnable runnable) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.firstSet = true;
    }

    public AnimatedFloat(Runnable runnable, long j, CubicBezierInterpolator cubicBezierInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.transitionDuration = j;
        this.transitionInterpolator = cubicBezierInterpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(Runnable runnable, long j, CubicBezierInterpolator cubicBezierInterpolator, int i) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.transitionDelay = 0L;
        this.transitionDuration = j;
        this.transitionInterpolator = cubicBezierInterpolator;
        this.firstSet = true;
    }

    public AnimatedFloat(AlertDialog.AlertDialogView alertDialogView) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        this.transitionInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = alertDialogView;
        this.targetValue = 0.0f;
        this.value = 0.0f;
        this.firstSet = false;
    }

    public AnimatedFloat(float f, View view, long j, long j2, Interpolator interpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.parent = view;
        this.targetValue = f;
        this.value = f;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = interpolator;
        this.firstSet = false;
    }

    public AnimatedFloat(float f, Runnable runnable, long j, long j2, CubicBezierInterpolator cubicBezierInterpolator) {
        this.transitionDelay = 0L;
        this.transitionDuration = 200L;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        this.invalidate = runnable;
        this.targetValue = f;
        this.value = f;
        this.transitionDelay = j;
        this.transitionDuration = j2;
        this.transitionInterpolator = cubicBezierInterpolator;
        this.firstSet = false;
    }
}
