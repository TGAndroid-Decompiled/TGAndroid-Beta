package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.graphics.Paint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.Theme;

public class AnimatedPaint extends Paint {
    private final AnimatedColor color;
    private final Theme.ResourcesProvider resourcesProvider;

    public AnimatedPaint(View view) {
        this(view, 320L, CubicBezierInterpolator.EASE_OUT_QUINT, 3, null);
    }

    public AnimatedPaint blendTo(int i, float f) {
        setColor(ColorUtils.blendARGB(f, getColor(), i));
        return this;
    }

    public AnimatedPaint force(int i) {
        setColor(this.color.force(i));
        return this;
    }

    public AnimatedPaint multAlpha(float f) {
        setAlpha((int) (getAlpha() * f));
        return this;
    }

    public AnimatedPaint set(int i) {
        setColor(this.color.set(i));
        return this;
    }

    public AnimatedPaint setByKey(int i) {
        setColor(this.color.set(Theme.getColor(i, this.resourcesProvider)));
        return this;
    }

    public AnimatedPaint(View view, Theme.ResourcesProvider resourcesProvider) {
        this(view, 320L, CubicBezierInterpolator.EASE_OUT_QUINT, 3, resourcesProvider);
    }

    public AnimatedPaint set(int i, float f) {
        setColor(Theme.multAlpha(f, this.color.set(i)));
        return this;
    }

    public AnimatedPaint setByKey(int i, float f) {
        setColor(Theme.multAlpha(f, this.color.set(Theme.getColor(i, this.resourcesProvider))));
        return this;
    }

    public AnimatedPaint(View view, int i) {
        this(view, 320L, CubicBezierInterpolator.EASE_OUT_QUINT, i, null);
    }

    public AnimatedPaint(View view, long j, TimeInterpolator timeInterpolator, int i) {
        this(view, j, timeInterpolator, i, null);
    }

    public AnimatedPaint(View view, long j, TimeInterpolator timeInterpolator, int i, Theme.ResourcesProvider resourcesProvider) {
        super(i);
        this.resourcesProvider = resourcesProvider;
        this.color = new AnimatedColor(view, j, timeInterpolator);
    }
}
