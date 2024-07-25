package org.telegram.ui.Components;

import android.view.animation.Interpolator;
public final class Easings {
    public static final Interpolator easeOutSine = new CubicBezierInterpolator(0.39d, 0.575d, 0.565d, 1.0d);
    public static final Interpolator easeInOutSine = new CubicBezierInterpolator(0.445d, 0.05d, 0.55d, 0.95d);
    public static final Interpolator easeInQuad = new CubicBezierInterpolator(0.55d, 0.085d, 0.68d, 0.53d);
    public static final Interpolator easeOutQuad = new CubicBezierInterpolator(0.25d, 0.46d, 0.45d, 0.94d);
    public static final Interpolator easeInOutQuad = new CubicBezierInterpolator(0.455d, 0.03d, 0.515d, 0.955d);
}
