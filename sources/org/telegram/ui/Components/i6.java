package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class i6 {
    public static final OvershootInterpolator f26887a = new OvershootInterpolator(1.9f);
    public static final g6 f26888b = new g6("alpha", 0);
    public static final mh.g f26889c;
    public static final g6 d;
    public static final g6 e;
    public static final mh.g f26890f;
    public static final mh.g f26891g;
    public static final mh.g h;

    static {
        new g6("color", 1);
        f26889c = new mh.g("currentAlpha", 6);
        d = new g6("alpha", 2);
        e = new g6("alpha", 3);
        f26890f = new mh.g("animationProgress", 7);
        f26891g = new mh.g("animationValue", 8);
        h = new mh.g("clipProgress", 9);
    }
}
