package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class r6 {
    public static final OvershootInterpolator f27779a = new OvershootInterpolator(1.9f);
    public static final p6 f27780b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.u8 f27781c;
    public static final p6 d;
    public static final p6 e;
    public static final org.telegram.ui.Cells.u8 f27782f;
    public static final org.telegram.ui.Cells.u8 f27783g;
    public static final org.telegram.ui.Cells.u8 h;

    static {
        new p6("color", 1);
        f27781c = new org.telegram.ui.Cells.u8("currentAlpha", 4);
        d = new p6("alpha", 2);
        e = new p6("alpha", 3);
        f27782f = new org.telegram.ui.Cells.u8("animationProgress", 5);
        f27783g = new org.telegram.ui.Cells.u8("animationValue", 6);
        h = new org.telegram.ui.Cells.u8("clipProgress", 7);
    }
}
