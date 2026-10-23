package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class t6 {
    public static final OvershootInterpolator f30649a = new OvershootInterpolator(1.9f);
    public static final r6 f30650b = new r6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f30651c;
    public static final r6 d;
    public static final r6 e;
    public static final org.telegram.ui.Cells.t8 f30652f;
    public static final org.telegram.ui.Cells.t8 f30653g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new r6("color", 1);
        f30651c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new r6("alpha", 2);
        e = new r6("alpha", 3);
        f30652f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f30653g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
