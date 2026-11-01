package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class i6 {
    public static final OvershootInterpolator f27006a = new OvershootInterpolator(1.9f);
    public static final g6 f27007b = new g6("alpha", 0);
    public static final mh.g f27008c;
    public static final g6 d;
    public static final g6 e;
    public static final mh.g f27009f;
    public static final mh.g f27010g;
    public static final mh.g h;

    static {
        new g6("color", 1);
        f27008c = new mh.g("currentAlpha", 6);
        d = new g6("alpha", 2);
        e = new g6("alpha", 3);
        f27009f = new mh.g("animationProgress", 7);
        f27010g = new mh.g("animationValue", 8);
        h = new mh.g("clipProgress", 9);
    }
}
