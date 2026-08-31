package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class n6 {
    public static final OvershootInterpolator f29411a = new OvershootInterpolator(1.9f);
    public static final l6 f29412b = new l6("alpha", 0);
    public static final ih.g f29413c;
    public static final l6 d;
    public static final l6 f29414e;
    public static final ih.g f29415f;
    public static final ih.g f29416g;
    public static final ih.g h;

    static {
        new l6("color", 1);
        f29413c = new ih.g("currentAlpha", 6);
        d = new l6("alpha", 2);
        f29414e = new l6("alpha", 3);
        f29415f = new ih.g("animationProgress", 7);
        f29416g = new ih.g("animationValue", 8);
        h = new ih.g("clipProgress", 9);
    }
}
