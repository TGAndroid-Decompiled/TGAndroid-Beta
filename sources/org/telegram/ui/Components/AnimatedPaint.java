package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.graphics.Paint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.Theme;

public class AnimatedPaint extends Paint {
    private final AnimatedColor color;
    private final Theme.ResourcesProvider resourcesProvider;

    public AnimatedPaint(View view, long j, TimeInterpolator timeInterpolator, int i, Theme.ResourcesProvider resourcesProvider) {
        super(i);
        this.resourcesProvider = resourcesProvider;
        this.color = new AnimatedColor(view, j, timeInterpolator);
    }

    public AnimatedPaint(View view, Theme.ResourcesProvider resourcesProvider) {
        this(view, 320L, CubicBezierInterpolator.EASE_OUT_QUINT, 3, resourcesProvider);
    }

    public AnimatedPaint blendTo(int i, float f) {
        setColor(ColorUtils.blendARGB(getColor(), i, f));
        return this;
    }

    public AnimatedPaint multAlpha(float f) {
        setAlpha((int) (getAlpha() * f));
        return this;
    }

    public AnimatedPaint setByKey(int i) {
        setColor(this.color.set(Theme.getColor(i, this.resourcesProvider)));
        return this;
    }

    public AnimatedPaint setByKey(int i, float f) {
        setColor(Theme.multAlpha(this.color.set(Theme.getColor(i, this.resourcesProvider)), f));
        return this;
    }
}
