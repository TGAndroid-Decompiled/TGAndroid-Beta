package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f32220a = new OvershootInterpolator(1.9f);
    public static final p6 f32221b = new p6("alpha", 0);
    public static final fh.g f32222c;
    public static final p6 d;
    public static final p6 f32223e;
    public static final fh.g f32224f;
    public static final fh.g f32225g;
    public static final fh.g h;

    static {
        new p6("color", 1);
        f32222c = new fh.g("currentAlpha", 6);
        d = new p6("alpha", 2);
        f32223e = new p6("alpha", 3);
        f32224f = new fh.g("animationProgress", 7);
        f32225g = new fh.g("animationValue", 8);
        h = new fh.g("clipProgress", 9);
    }
}
