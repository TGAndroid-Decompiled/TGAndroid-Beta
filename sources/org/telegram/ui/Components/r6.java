package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f39048a = new OvershootInterpolator(1.9f);
    public static final p6 f39049b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.p8 f39050c;
    public static final p6 d;
    public static final p6 f39051e;
    public static final org.telegram.ui.Cells.p8 f39052f;
    public static final org.telegram.ui.Cells.p8 f39053g;
    public static final org.telegram.ui.Cells.p8 h;

    static {
        new p6("color", 1);
        f39050c = new org.telegram.ui.Cells.p8("currentAlpha", 4);
        d = new p6("alpha", 2);
        f39051e = new p6("alpha", 3);
        f39052f = new org.telegram.ui.Cells.p8("animationProgress", 5);
        f39053g = new org.telegram.ui.Cells.p8("animationValue", 6);
        h = new org.telegram.ui.Cells.p8("clipProgress", 7);
    }
}
