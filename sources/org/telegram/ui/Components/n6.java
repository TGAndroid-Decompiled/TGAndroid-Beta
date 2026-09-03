package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class n6 {
    public static final OvershootInterpolator f29394a = new OvershootInterpolator(1.9f);
    public static final l6 f29395b = new l6("alpha", 0);
    public static final ih.g f29396c;
    public static final l6 d;
    public static final l6 f29397e;
    public static final ih.g f29398f;
    public static final ih.g f29399g;
    public static final ih.g h;

    static {
        new l6("color", 1);
        f29396c = new ih.g("currentAlpha", 6);
        d = new l6("alpha", 2);
        f29397e = new l6("alpha", 3);
        f29398f = new ih.g("animationProgress", 7);
        f29399g = new ih.g("animationValue", 8);
        h = new ih.g("clipProgress", 9);
    }
}
