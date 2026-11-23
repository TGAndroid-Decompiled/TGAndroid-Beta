package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f39094a = new OvershootInterpolator(1.9f);
    public static final p6 f39095b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.p8 f39096c;
    public static final p6 d;
    public static final p6 f39097e;
    public static final org.telegram.ui.Cells.p8 f39098f;
    public static final org.telegram.ui.Cells.p8 f39099g;
    public static final org.telegram.ui.Cells.p8 h;

    static {
        new p6("color", 1);
        f39096c = new org.telegram.ui.Cells.p8("currentAlpha", 4);
        d = new p6("alpha", 2);
        f39097e = new p6("alpha", 3);
        f39098f = new org.telegram.ui.Cells.p8("animationProgress", 5);
        f39099g = new org.telegram.ui.Cells.p8("animationValue", 6);
        h = new org.telegram.ui.Cells.p8("clipProgress", 7);
    }
}
