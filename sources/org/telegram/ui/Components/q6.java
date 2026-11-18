package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class q6 {
    public static final OvershootInterpolator f38711a = new OvershootInterpolator(1.9f);
    public static final o6 f38712b = new o6("alpha", 0);
    public static final org.telegram.ui.Cells.p8 f38713c;
    public static final o6 d;
    public static final o6 f38714e;
    public static final org.telegram.ui.Cells.p8 f38715f;
    public static final org.telegram.ui.Cells.p8 f38716g;
    public static final org.telegram.ui.Cells.p8 h;

    static {
        new o6("color", 1);
        f38713c = new org.telegram.ui.Cells.p8("currentAlpha", 4);
        d = new o6("alpha", 2);
        f38714e = new o6("alpha", 3);
        f38715f = new org.telegram.ui.Cells.p8("animationProgress", 5);
        f38716g = new org.telegram.ui.Cells.p8("animationValue", 6);
        h = new org.telegram.ui.Cells.p8("clipProgress", 7);
    }
}
