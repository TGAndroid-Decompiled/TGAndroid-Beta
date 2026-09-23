package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class s6 {
    public static final OvershootInterpolator f27834a = new OvershootInterpolator(1.9f);
    public static final q6 f27835b = new q6("alpha", 0);
    public static final org.telegram.ui.Cells.u8 f27836c;
    public static final q6 d;
    public static final q6 e;
    public static final org.telegram.ui.Cells.u8 f27837f;
    public static final org.telegram.ui.Cells.u8 f27838g;
    public static final org.telegram.ui.Cells.u8 h;

    static {
        new q6("color", 1);
        f27836c = new org.telegram.ui.Cells.u8("currentAlpha", 4);
        d = new q6("alpha", 2);
        e = new q6("alpha", 3);
        f27837f = new org.telegram.ui.Cells.u8("animationProgress", 5);
        f27838g = new org.telegram.ui.Cells.u8("animationValue", 6);
        h = new org.telegram.ui.Cells.u8("clipProgress", 7);
    }
}
