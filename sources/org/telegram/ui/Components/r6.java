package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f39093a = new OvershootInterpolator(1.9f);
    public static final p6 f39094b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.p8 f39095c;
    public static final p6 d;
    public static final p6 f39096e;
    public static final org.telegram.ui.Cells.p8 f39097f;
    public static final org.telegram.ui.Cells.p8 f39098g;
    public static final org.telegram.ui.Cells.p8 h;

    static {
        new p6("color", 1);
        f39095c = new org.telegram.ui.Cells.p8("currentAlpha", 4);
        d = new p6("alpha", 2);
        f39096e = new p6("alpha", 3);
        f39097f = new org.telegram.ui.Cells.p8("animationProgress", 5);
        f39098g = new org.telegram.ui.Cells.p8("animationValue", 6);
        h = new org.telegram.ui.Cells.p8("clipProgress", 7);
    }
}
