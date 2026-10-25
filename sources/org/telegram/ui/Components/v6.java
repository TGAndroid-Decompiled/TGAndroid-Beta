package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class v6 {
    public static final OvershootInterpolator f33576a = new OvershootInterpolator(1.9f);
    public static final t6 f33577b = new t6("alpha", 0);
    public static final org.telegram.ui.Cells.x8 f33578c;
    public static final t6 d;
    public static final t6 e;
    public static final org.telegram.ui.Cells.x8 f33579f;
    public static final org.telegram.ui.Cells.x8 f33580g;
    public static final org.telegram.ui.Cells.x8 h;

    static {
        new t6("color", 1);
        f33578c = new org.telegram.ui.Cells.x8("currentAlpha", 4);
        d = new t6("alpha", 2);
        e = new t6("alpha", 3);
        f33579f = new org.telegram.ui.Cells.x8("animationProgress", 5);
        f33580g = new org.telegram.ui.Cells.x8("animationValue", 6);
        h = new org.telegram.ui.Cells.x8("clipProgress", 7);
    }
}
