package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
public class AnimatedColor {
    private Runnable invalidate;
    private View parent;
    private int startValue;
    private int targetValue;
    private boolean transition;
    private long transitionStart;
    private int value;
    private long transitionDelay = 0;
    private long transitionDuration = 200;
    private TimeInterpolator transitionInterpolator = CubicBezierInterpolator.DEFAULT;
    private boolean firstSet = true;

    public AnimatedColor(View view) {
        this.parent = view;
    }

    public int set(int i) {
        return set(i, false);
    }

    public int set(int i, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.transitionDuration <= 0 || this.firstSet) {
            this.targetValue = i;
            this.value = i;
            this.transition = false;
            this.firstSet = false;
        } else if (this.targetValue != i) {
            this.transition = true;
            this.targetValue = i;
            this.startValue = this.value;
            this.transitionStart = elapsedRealtime;
        }
        if (this.transition) {
            float clamp = MathUtils.clamp(((float) ((elapsedRealtime - this.transitionStart) - this.transitionDelay)) / ((float) this.transitionDuration), 0.0f, 1.0f);
            if (elapsedRealtime - this.transitionStart >= this.transitionDelay) {
                TimeInterpolator timeInterpolator = this.transitionInterpolator;
                if (timeInterpolator == null) {
                    this.value = ColorUtils.blendARGB(this.startValue, this.targetValue, clamp);
                } else {
                    this.value = ColorUtils.blendARGB(this.startValue, this.targetValue, timeInterpolator.getInterpolation(clamp));
                }
            }
            if (clamp >= 1.0f) {
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
}
