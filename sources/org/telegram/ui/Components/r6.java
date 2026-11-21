package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f39084a = new OvershootInterpolator(1.9f);
    public static final p6 f39085b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.p8 f39086c;
    public static final p6 d;
    public static final p6 f39087e;
    public static final org.telegram.ui.Cells.p8 f39088f;
    public static final org.telegram.ui.Cells.p8 f39089g;
    public static final org.telegram.ui.Cells.p8 h;

    static {
        new p6("color", 1);
        f39086c = new org.telegram.ui.Cells.p8("currentAlpha", 4);
        d = new p6("alpha", 2);
        f39087e = new p6("alpha", 3);
        f39088f = new org.telegram.ui.Cells.p8("animationProgress", 5);
        f39089g = new org.telegram.ui.Cells.p8("animationValue", 6);
        h = new org.telegram.ui.Cells.p8("clipProgress", 7);
    }
}
