package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class k6 {
    public static final OvershootInterpolator f36287a = new OvershootInterpolator(1.9f);
    public static final i6 f36288b = new i6("alpha", 0);
    public static final org.telegram.ui.Cells.n8 f36289c;
    public static final i6 d;
    public static final i6 f36290e;
    public static final org.telegram.ui.Cells.n8 f36291f;
    public static final org.telegram.ui.Cells.n8 f36292g;
    public static final org.telegram.ui.Cells.n8 h;

    static {
        new i6("color", 1);
        f36289c = new org.telegram.ui.Cells.n8("currentAlpha", 4);
        d = new i6("alpha", 2);
        f36290e = new i6("alpha", 3);
        f36291f = new org.telegram.ui.Cells.n8("animationProgress", 5);
        f36292g = new org.telegram.ui.Cells.n8("animationValue", 6);
        h = new org.telegram.ui.Cells.n8("clipProgress", 7);
    }
}
