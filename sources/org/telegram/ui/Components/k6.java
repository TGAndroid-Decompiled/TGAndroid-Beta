package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class k6 {
    public static final OvershootInterpolator f35322a = new OvershootInterpolator(1.9f);
    public static final i6 f35323b = new i6("alpha", 0);
    public static final org.telegram.ui.Cells.n8 f35324c;
    public static final i6 d;
    public static final i6 f35325e;
    public static final org.telegram.ui.Cells.n8 f35326f;
    public static final org.telegram.ui.Cells.n8 f35327g;
    public static final org.telegram.ui.Cells.n8 h;

    static {
        new i6("color", 1);
        f35324c = new org.telegram.ui.Cells.n8("currentAlpha", 4);
        d = new i6("alpha", 2);
        f35325e = new i6("alpha", 3);
        f35326f = new org.telegram.ui.Cells.n8("animationProgress", 5);
        f35327g = new org.telegram.ui.Cells.n8("animationValue", 6);
        h = new org.telegram.ui.Cells.n8("clipProgress", 7);
    }
}
