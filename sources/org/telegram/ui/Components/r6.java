package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f26599a = new OvershootInterpolator(1.9f);
    public static final p6 f26600b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.u8 f26601c;
    public static final p6 d;
    public static final p6 e;
    public static final org.telegram.ui.Cells.u8 f26602f;
    public static final org.telegram.ui.Cells.u8 f26603g;
    public static final org.telegram.ui.Cells.u8 h;

    static {
        new p6("color", 1);
        f26601c = new org.telegram.ui.Cells.u8("currentAlpha", 4);
        d = new p6("alpha", 2);
        e = new p6("alpha", 3);
        f26602f = new org.telegram.ui.Cells.u8("animationProgress", 5);
        f26603g = new org.telegram.ui.Cells.u8("animationValue", 6);
        h = new org.telegram.ui.Cells.u8("clipProgress", 7);
    }
}
