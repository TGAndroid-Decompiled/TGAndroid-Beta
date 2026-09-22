package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class q6 {
    public static final OvershootInterpolator f27256a = new OvershootInterpolator(1.9f);
    public static final o6 f27257b = new o6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f27258c;
    public static final o6 d;
    public static final o6 e;
    public static final org.telegram.ui.Cells.t8 f27259f;
    public static final org.telegram.ui.Cells.t8 f27260g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new o6("color", 1);
        f27258c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new o6("alpha", 2);
        e = new o6("alpha", 3);
        f27259f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f27260g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
