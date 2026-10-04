package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class s6 {
    public static final OvershootInterpolator f30629a = new OvershootInterpolator(1.9f);
    public static final q6 f30630b = new q6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f30631c;
    public static final q6 d;
    public static final q6 f30632e;
    public static final org.telegram.ui.Cells.t8 f30633f;
    public static final org.telegram.ui.Cells.t8 f30634g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new q6("color", 1);
        f30631c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new q6("alpha", 2);
        f30632e = new q6("alpha", 3);
        f30633f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f30634g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
