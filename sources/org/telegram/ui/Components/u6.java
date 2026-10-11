package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class u6 {
    public static final OvershootInterpolator f31448a = new OvershootInterpolator(1.9f);
    public static final s6 f31449b = new s6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f31450c;
    public static final s6 d;
    public static final s6 f31451e;
    public static final org.telegram.ui.Cells.t8 f31452f;
    public static final org.telegram.ui.Cells.t8 f31453g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new s6("color", 1);
        f31450c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new s6("alpha", 2);
        f31451e = new s6("alpha", 3);
        f31452f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f31453g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
