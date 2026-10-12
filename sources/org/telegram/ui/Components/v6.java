package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class v6 {
    public static final OvershootInterpolator f29899a = new OvershootInterpolator(1.9f);
    public static final t6 f29900b = new t6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f29901c;
    public static final t6 d;
    public static final t6 e;
    public static final org.telegram.ui.Cells.t8 f29902f;
    public static final org.telegram.ui.Cells.t8 f29903g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new t6("color", 1);
        f29901c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new t6("alpha", 2);
        e = new t6("alpha", 3);
        f29902f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f29903g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
