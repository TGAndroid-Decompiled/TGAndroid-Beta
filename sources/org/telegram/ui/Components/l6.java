package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class l6 {
    public static final OvershootInterpolator f35548a = new OvershootInterpolator(1.9f);
    public static final j6 f35549b = new j6("alpha", 0);
    public static final org.telegram.ui.Cells.o8 f35550c;
    public static final j6 d;
    public static final j6 f35551e;
    public static final org.telegram.ui.Cells.o8 f35552f;
    public static final org.telegram.ui.Cells.o8 f35553g;
    public static final org.telegram.ui.Cells.o8 h;

    static {
        new j6("color", 1);
        f35550c = new org.telegram.ui.Cells.o8("currentAlpha", 4);
        d = new j6("alpha", 2);
        f35551e = new j6("alpha", 3);
        f35552f = new org.telegram.ui.Cells.o8("animationProgress", 5);
        f35553g = new org.telegram.ui.Cells.o8("animationValue", 6);
        h = new org.telegram.ui.Cells.o8("clipProgress", 7);
    }
}
