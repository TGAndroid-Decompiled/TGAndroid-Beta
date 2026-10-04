package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class s6 {
    public static final OvershootInterpolator f30636a = new OvershootInterpolator(1.9f);
    public static final q6 f30637b = new q6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f30638c;
    public static final q6 d;
    public static final q6 f30639e;
    public static final org.telegram.ui.Cells.t8 f30640f;
    public static final org.telegram.ui.Cells.t8 f30641g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new q6("color", 1);
        f30638c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new q6("alpha", 2);
        f30639e = new q6("alpha", 3);
        f30640f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f30641g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
