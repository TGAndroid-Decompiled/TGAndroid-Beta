package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class v6 {
    public static final OvershootInterpolator f33569a = new OvershootInterpolator(1.9f);
    public static final t6 f33570b = new t6("alpha", 0);
    public static final org.telegram.ui.Cells.x8 f33571c;
    public static final t6 d;
    public static final t6 e;
    public static final org.telegram.ui.Cells.x8 f33572f;
    public static final org.telegram.ui.Cells.x8 f33573g;
    public static final org.telegram.ui.Cells.x8 h;

    static {
        new t6("color", 1);
        f33571c = new org.telegram.ui.Cells.x8("currentAlpha", 4);
        d = new t6("alpha", 2);
        e = new t6("alpha", 3);
        f33572f = new org.telegram.ui.Cells.x8("animationProgress", 5);
        f33573g = new org.telegram.ui.Cells.x8("animationValue", 6);
        h = new org.telegram.ui.Cells.x8("clipProgress", 7);
    }
}
