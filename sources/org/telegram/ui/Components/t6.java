package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class t6 {
    public static final OvershootInterpolator f30536a = new OvershootInterpolator(1.9f);
    public static final r6 f30537b = new r6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 f30538c;
    public static final r6 d;
    public static final r6 f30539e;
    public static final org.telegram.ui.Cells.t8 f30540f;
    public static final org.telegram.ui.Cells.t8 f30541g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new r6("color", 1);
        f30538c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new r6("alpha", 2);
        f30539e = new r6("alpha", 3);
        f30540f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        f30541g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
