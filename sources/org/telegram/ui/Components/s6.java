package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class s6 {
    public static final OvershootInterpolator f28161a = new OvershootInterpolator(1.9f);
    public static final q6 f28162b = new q6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f28163c;
    public static final q6 d;
    public static final q6 e;
    public static final org.telegram.ui.Cells.t8 f28164f;
    public static final org.telegram.ui.Cells.t8 f28165g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new q6("color", 1);
        f28163c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new q6("alpha", 2);
        e = new q6("alpha", 3);
        f28164f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f28165g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
