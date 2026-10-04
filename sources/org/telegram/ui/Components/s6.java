package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class s6 {
    public static final OvershootInterpolator f30630a = new OvershootInterpolator(1.9f);
    public static final q6 f30631b = new q6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f30632c;
    public static final q6 d;
    public static final q6 f30633e;
    public static final org.telegram.ui.Cells.t8 f30634f;
    public static final org.telegram.ui.Cells.t8 f30635g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new q6("color", 1);
        f30632c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new q6("alpha", 2);
        f30633e = new q6("alpha", 3);
        f30634f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f30635g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
