package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class u6 {
    public static final OvershootInterpolator f31059a = new OvershootInterpolator(1.9f);
    public static final s6 f31060b = new s6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f31061c;
    public static final s6 d;
    public static final s6 f31062e;
    public static final org.telegram.ui.Cells.t8 f31063f;
    public static final org.telegram.ui.Cells.t8 f31064g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new s6("color", 1);
        f31061c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new s6("alpha", 2);
        f31062e = new s6("alpha", 3);
        f31063f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f31064g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
