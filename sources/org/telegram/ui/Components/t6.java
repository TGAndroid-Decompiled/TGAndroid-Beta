package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class t6 {
    public static final OvershootInterpolator f30448a = new OvershootInterpolator(1.9f);
    public static final r6 f30449b = new r6("alpha", 0);
    public static final org.telegram.ui.Cells.s8 f30450c;
    public static final r6 d;
    public static final r6 e;
    public static final org.telegram.ui.Cells.s8 f30451f;
    public static final org.telegram.ui.Cells.s8 f30452g;
    public static final org.telegram.ui.Cells.s8 h;

    static {
        new r6("color", 1);
        f30450c = new org.telegram.ui.Cells.s8("currentAlpha", 4);
        d = new r6("alpha", 2);
        e = new r6("alpha", 3);
        f30451f = new org.telegram.ui.Cells.s8("animationProgress", 5);
        f30452g = new org.telegram.ui.Cells.s8("animationValue", 6);
        h = new org.telegram.ui.Cells.s8("clipProgress", 7);
    }
}
