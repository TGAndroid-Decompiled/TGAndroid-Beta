package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class t6 {
    public static final OvershootInterpolator f30447a = new OvershootInterpolator(1.9f);
    public static final r6 f30448b = new r6("alpha", 0);
    public static final org.telegram.ui.Cells.s8 f30449c;
    public static final r6 d;
    public static final r6 e;
    public static final org.telegram.ui.Cells.s8 f30450f;
    public static final org.telegram.ui.Cells.s8 f30451g;
    public static final org.telegram.ui.Cells.s8 h;

    static {
        new r6("color", 1);
        f30449c = new org.telegram.ui.Cells.s8("currentAlpha", 4);
        d = new r6("alpha", 2);
        e = new r6("alpha", 3);
        f30450f = new org.telegram.ui.Cells.s8("animationProgress", 5);
        f30451g = new org.telegram.ui.Cells.s8("animationValue", 6);
        h = new org.telegram.ui.Cells.s8("clipProgress", 7);
    }
}
