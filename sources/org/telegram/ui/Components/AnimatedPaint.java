package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.ActionBar.Theme;

public final class AnimatedPaint extends Paint {
    public final AnimatedColor color;
    public final Theme.ResourcesProvider resourcesProvider;

    public AnimatedPaint(Theme.ResourcesProvider resourcesProvider, View view) {
        super(3);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.resourcesProvider = resourcesProvider;
        this.color = new AnimatedColor(view, 320L, cubicBezierInterpolator);
    }
}
