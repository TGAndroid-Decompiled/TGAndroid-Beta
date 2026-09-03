package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class n6 {
    public static final OvershootInterpolator f27195a = new OvershootInterpolator(1.9f);
    public static final l6 f27196b = new l6("alpha", 0);
    public static final hh.g f27197c;
    public static final l6 d;
    public static final l6 e;
    public static final hh.g f27198f;
    public static final hh.g f27199g;
    public static final hh.g h;

    static {
        new l6("color", 1);
        f27197c = new hh.g("currentAlpha", 6);
        d = new l6("alpha", 2);
        e = new l6("alpha", 3);
        f27198f = new hh.g("animationProgress", 7);
        f27199g = new hh.g("animationValue", 8);
        h = new hh.g("clipProgress", 9);
    }
}
