package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f30073a = new OvershootInterpolator(1.9f);
    public static final p6 f30074b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f30075c;
    public static final p6 d;
    public static final p6 e;
    public static final org.telegram.ui.Cells.t8 f30076f;
    public static final org.telegram.ui.Cells.t8 f30077g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new p6("color", 1);
        f30075c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new p6("alpha", 2);
        e = new p6("alpha", 3);
        f30076f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f30077g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
